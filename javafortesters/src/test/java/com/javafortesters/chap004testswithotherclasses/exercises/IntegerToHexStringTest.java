package com.javafortesters.chap004testswithotherclasses.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToHexStringTest {
    @Test
    public void elevenToB(){
        String result = Integer.toHexString(11);
        assertEquals("int 11 to String b","b", result);
    }
    @Test
    public void tenToA(){
        String result = Integer.toHexString(10);
        assertEquals("int 10 to String a","a", result);
    }
    @Test
    public void threeToThree(){
        String result = Integer.toHexString(3);
        assertEquals("int 3 to String 3","3", result);
    }
    @Test
    public void twentyoneToFifteen(){
        String result = Integer.toHexString(21);
        assertEquals("int 21 to String 15","15", result);
    }
}
