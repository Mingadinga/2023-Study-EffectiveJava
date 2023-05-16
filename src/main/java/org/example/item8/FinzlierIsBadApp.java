package org.example.item8;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

public class FinzlierIsBadApp {
    public static void main(String[] args) throws Exception {

        int i = 0;

        while (true) {
            // 무한루프 돌면서 gc할 객체 생성
            i++;
            new FinalizerIsBad();

            // Finalizer 동작 매커니즘
            // 큐에 쌓이는 오브젝트는 finalize()를 오버라이딩한 FinalizerIsBad
            // finalizer 스레드는 다른 애플리케이션 스레드보다 우선순위가 낮기 때문에 gc할 객체가 쌓인다
            // 큐에 등록된 객체들은 가비지 컬렉터가 다음 단계에서 해당 객체들의 finalize() 메서드를 호출한다
            // 호출된 finalize() 메서드에서는 해당 객체의 리소스 정리나 후처리 작업을 수행할 수 있다
            // finalize() 메서드가 호출되고 나면, 해당 객체는 가비지 컬렉터에 의해 메모리에서 해제

            // 백만개쯤 만들었을 때 finalizer 실행한다.
            // Finalizer 내부의 Queue에 얼마나 많은 오브젝트가 쌓여있는지 확인
            if ((i % 1_000_000) == 0) {
                Class<?> finalizerClass = Class.forName("java.lang.ref.Finalizer");
                Field queueStaticField = finalizerClass.getDeclaredField("queue");
                queueStaticField.setAccessible(true);
                ReferenceQueue<Object> referenceQueue = (ReferenceQueue) queueStaticField.get(null);

                Field queueLengthField = ReferenceQueue.class.getDeclaredField("queueLength");
                queueLengthField.setAccessible(true);
                long queueLength = (long) queueLengthField.get(referenceQueue);
                System.out.format("There are %d references in the queue%n", queueLength);
            }

        }
    }
}
