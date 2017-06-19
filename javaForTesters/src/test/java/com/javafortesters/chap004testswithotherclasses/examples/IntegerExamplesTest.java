package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration() {
        Integer five = new Integer(4); //dlaczego test przechodzi skoro "5" jest Stringiem a porównywany do int?
        assertEquals("intValue returns 5", 4, five.intValue());


        Integer four = new Integer("5");
        assertEquals("should return 4", 5, four.intValue());
    }
}

