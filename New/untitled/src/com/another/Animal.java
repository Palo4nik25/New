package com.another;

public class Animal {
    public String name;

    public Animal(String name) {
        setValues(name);
    }

    private void setValues(String name) {
        this.name = name;
    }

    public String getValues() {
        StringBuilder res = new StringBuilder();
        res.append("My name is ").append(name);
        return res.toString();
    }
}
