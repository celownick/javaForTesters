package com.javafortesters.chap002InstantiateAnIntegerWithASring;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstantiateAnIntegerAsAString {
    @Test
    public void Instantiate(){
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5 ",5,five.intValue());

    }
}


