package io.zipcoder.polymorphism;

public class Pet {
    public String name;
    public Pet() {
        name = "";
    }
    public Pet(String name) {
        this.name = name;
    }
    public String speak() {
        return "";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
