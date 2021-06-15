package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TernaryOperatorTest {
    @Test
    public void ternaryEnsureStartsWithHTTP(){
        String url = "www.eviltester.com";
        url = url.startsWith("http://") ? url : "http://" + url;
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }
}
