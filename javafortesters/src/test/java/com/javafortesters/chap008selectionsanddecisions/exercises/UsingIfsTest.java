package com.javafortesters.chap008selectionsanddecisions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UsingIfsTest {
    private boolean truthy = true;

    @Test
    public void exerciseA (){
        if(truthy) assertTrue(truthy);
    }

    @Test
    public void exerciseB (){
        if(truthy){
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void exerciseC(){
        if (truthy) assertTrue(truthy);
        else assertFalse(truthy);
    }

    @Test
    public void exerciseD(){
        if(truthy){
            assertFalse(!truthy);
            assertTrue(truthy);
        } else {
            assertFalse(truthy);
        }
    }
}
