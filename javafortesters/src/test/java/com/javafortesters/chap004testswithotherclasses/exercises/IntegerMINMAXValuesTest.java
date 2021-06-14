package com.javafortesters.chap004testswithotherclasses.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class IntegerMINMAXValuesTest {
    @Test
    public void IntegerMINValue(){
        int result = Integer.MIN_VALUE;
        int expected = -2147483648;
        assertEquals("Integer MIN Value", expected, result);
    }
    @Test
    public void IntegerMAXValue(){
        int result = Integer.MAX_VALUE;
        int expected = 2147483647;
        assertEquals("Integer MAX Value", expected, result);
    }
}
