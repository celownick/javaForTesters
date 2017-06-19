package com.javafortesters.domainentities;

public class Car {
    private String engine;
    private String color;

    public Car (String engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public String getEngine() {
        return engine;
    }

}

