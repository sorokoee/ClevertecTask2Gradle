package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {
    @Test
    public void isPositiveNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("1"));
        assertTrue(StringUtils.isPositiveNumber("23"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertFalse(StringUtils.isPositiveNumber("0"));
    }
}
