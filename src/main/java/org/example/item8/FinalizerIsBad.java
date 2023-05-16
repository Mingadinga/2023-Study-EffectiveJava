package org.example.item8;

public class FinalizerIsBad {
    // Object에 정의된 finalize() 오버라이딩하여 리소스 정리 작업 정의
    // FinalizerIsBad가 gc에 의해 소거되기 직전 수행
    @Override
    protected void finalize() throws Throwable {
//        System.out.println("");
    }
}
