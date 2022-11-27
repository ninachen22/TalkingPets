package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void speakTest() {
        Pet pet = new Pet();
        String expected = "Woof!";
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nullaryConstructorTest() {
        Pet pet = new Pet();
        String expected = "Ben";
        pet.setName(expected);
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void constructorTest() {
        Pet pet = new Pet("Mushu");
        String expected = "Mushu";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }
}
