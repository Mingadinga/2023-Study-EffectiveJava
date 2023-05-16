package org.example.item8;

import java.util.List;

public class BigObject {

    private List<Object> resources; // 정리가 필요한 리소스 ex. 이미지 파일

    public BigObject(List<Object> resources) { this.resources = resources; }

    // 내부 클래스는 반드시 static으로! static이 아니라면 참조가 살아있어서 메모리 누수 발생
    public static class ResourceCleaner implements Runnable {

        private List<Object> resourceToClean;

        public ResourceCleaner(List<Object> resourceToClean) {
            this.resourceToClean = resourceToClean;
        }

        // 리소스 정리
        @Override
        public void run() {
            resourceToClean = null;
            System.out.println("cleaned up.");
        }
    }

}
