package com.github.redxiiikk.maven.multi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BServiceTest {
    @Test
    void test_case_1() {
        Assertions.assertEquals(3, new BService().add(1, 2));
    }
}