package com.javafortesters.chap008selectionsanddecisions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatOrCatsTest {
    @Test
    public void catOrCats5(){
        String result = catOrCats(5 );
        assertEquals("5 is cats", "cats", result);
    }

    @Test
    public void catOrCats1(){
        String result = catOrCats(1 );
        assertEquals("1 is cat", "cat", result);
    }

    private String catOrCats(int amount){
        String result = amount > 1 ? "cats" : "cat";
        return result;
    }
}