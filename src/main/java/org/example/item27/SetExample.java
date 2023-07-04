package org.example.item27;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    /*
    타입 안전성을 보장할 수 없다! (raw 타입을 사용했으므로)
    HashSet에 Integer, String을 섞어서 넣고
    모두 String 타입으로 파싱하면 ClassCastException 발생한다
    Warning : Raw use of parameterized class 'HashSet'
     */
    Set s1 = new HashSet();

    /*
    여전히 타입 안전성을 보장할 수 없다! (raw 타입을 사용했으므로)
    Warning : Raw use of parameterized class 'HashSet'
     */
    Set<String> s2 = new HashSet();

    /*
    타입 안전한 코드
    컴파일러가 컬렉션에서 원소를 꺼내는 모든 곳에 보이지 않는 형변환을 추가하여 절대 실패하지 않음을 보장할 수 있음
     */
    Set<String> s3 = new HashSet<String>();

    /*
    다이아몬드 연산자로 타입 추론 가능
     */
    Set<String> s4 = new HashSet<>();


}
