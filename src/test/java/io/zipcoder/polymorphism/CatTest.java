package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest() {
        Cat cat = new Cat();
        String expected = "Meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nullaryCatTest() {
        Cat cat = new Cat();
        String expected = "Kitty";
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void constructorTest() {
        Cat cat = new Cat("Mallory");
        String expected = "Mallory";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
}
