package org.example.item39.ExceptionTest;

import java.lang.annotation.*;

/**
 * 명시한 예외를 던져야만 성공하는 애노테이션
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}