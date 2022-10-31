package ru.netology.naumova;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;


public class SalesManagerTest {
    private SalesManager salesManager;
    private long[] sales = new long[]{105, 333, 6};

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(sales);
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void setUpApp() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    @Test
    void max() {
        Assertions.assertEquals(333, salesManager.max());
    }

    @Test
    void min() {
        Assertions.assertEquals(6, salesManager.min());
    }

    @Test
    void stat() {
        Assertions.assertEquals(105, salesManager.stat());
    }

   @Test
    void stat_delenieNaNull() {
        SalesManager salesManager1 = new SalesManager(new long[] {2, 989476});
        Assertions.assertThrows(ArithmeticException.class, () -> salesManager1.stat());
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void newMax(long input, int expected) {
        Assertions.assertEquals(expected, salesManager.newMax(input));

    }
    private static Stream<Arguments> getArguments() {
        return  Stream.of(
                Arguments.of(19874, 19874),
                Arguments.of(25, 333)
        );
    }
}