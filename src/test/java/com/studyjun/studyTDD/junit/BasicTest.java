package com.studyjun.studyTDD.junit;

import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BasicTest {

    @Test
    void createPersonTest() {
        Person person = new Person( "Yoon", "1996.06.04" );
        assertNotNull( person );
    }

    @Test
    void secondTest() {
        System.out.println( "secondTest executed." );
    }

    @Test
    @DisplayName("TestInfo 정보 확인하기")
    @Tag("Fast")
    void thirdTest( TestInfo testInfo ) {
        Optional<Class<?>> testClass = testInfo.getTestClass();
        System.out.println( testClass.get().getName() );
        System.out.println( testInfo.getTestMethod().toString() );
        System.out.println( testInfo.getDisplayName() );
        System.out.println( testInfo.getTags() );
    }

    // 테스트 실행 이전 1회 실행
    @BeforeAll
    static void beforeAll() {
        System.out.println( "before all executed." );
    }

    // 테스트 실행 이후 1회 실행
    @AfterAll
    static void afterAll() {
        System.out.println( "after all executed." );
    }

    // 지정된 각 테스트 이전 매번 1회 실행
    @BeforeEach
    void beforeEach() {
        System.out.println( "before each executed." );
    }

    // 지정된 각 테스트 이후 매번 1회 실행
    @AfterEach
    void afterEach() {
        System.out.println( "after each executed." );
    }
}