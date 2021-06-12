package com.javafortesters.chap004testswithotherclasses.examples;
// ctrl p (win) of cmd p (mac) in de class parameters bv Integer( hiere )
// toont alle contructors die ge kunt doen, voor Integer int of String
// kunt vandaar dan bv alle constructors nekeer testen

// classnaam. en dan ff wachten, geeft de IDE u alle static methods
//    op een dag uitzoeken hoe ge dat met code doet om een list van alle methods te hebben
// ctrl q (win) ctrl j (mac) voor de help file per method
// kunt natuurlijk ook in de documentatie kijken voor de class

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
        // we doen het nu gewoon zo voor demonstratie
        // negeer de 'aah dat doen we niet meer zo' doorstreep

        // ctrl p zegt int of string mag, we gaan dat testen:
        // int
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
        // string
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
        // zoals gezegd moet Integer(...) niet voor Integers te declareren
        // noemt AutoBoxing btw
        // "Autoboxing will automatically convert from a primitive type to the
        //associated class automatically."
        Integer six = 6;
        assertEquals("autoboxing assignment for 6",6, six.intValue());
        // drie tests al in één method is vies, maar we volgen den boek



    }
}
