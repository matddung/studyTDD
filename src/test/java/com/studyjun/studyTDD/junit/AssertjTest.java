package com.studyjun.studyTDD.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AssertjTest {

    @Test
    @DisplayName("AssertJ 표현 방식")
    void multiplyTest() {
        assertThat( 4 * 5 ).isEqualTo( 20 );
    }

    @Test
    @DisplayName("AssertJ Exception 처리")
    void exceptionTest() {
        assertThatThrownBy( () -> new Person( "Yoon", "2000.1.1" ) )
                .isInstanceOf( IllegalArgumentException.class );
    }
}
