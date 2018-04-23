package com.company;

public abstract class Reiziger implements Nameable {

    private String name;

    public Reiziger(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}