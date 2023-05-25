package com.github.redxiiikk.maven.multi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AServiceTest {
    @Test
    void test_case_1() {
        Assertions.assertEquals(1, new AService().subtraction(2, 1));
    }
}