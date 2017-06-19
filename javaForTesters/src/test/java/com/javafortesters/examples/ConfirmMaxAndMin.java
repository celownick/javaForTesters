package com.javafortesters.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfirmMaxAndMin{
    @Test
    public void  maxAndMin() {
        int min = -2147483648;
        int max =  2147483647;

        assertEquals("min value is -2147483648 ", min, Integer.MIN_VALUE);
        assertEquals("max value is  2147483647 ", max, Integer.MAX_VALUE);
    }
}