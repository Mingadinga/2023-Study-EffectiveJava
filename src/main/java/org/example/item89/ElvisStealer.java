package org.example.item89;

import java.io.Serializable;

public class ElvisStealer implements Serializable {
    static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
        // resolve 되기 전의 Elvis 인스턴스(깨진 싱글톤) 참조를 저장한다.
        impersonator = payload;

        // favoriteSongs 필드에 맞는 타입의 객체 반환
        return new String[] { "A Fool Such as I" };
    }

    private static final long serialVersionUID = 0;
}
