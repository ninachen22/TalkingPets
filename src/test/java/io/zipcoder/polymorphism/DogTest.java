package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest() {
        Dog dog = new Dog();
        String expected = "Woof!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nullaryDogTest() {
        Dog dog = new Dog();
        String expected = "Tofu";
        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void constructorTest() {
        Dog dog = new Dog("Beary");
        String expected = "Beary";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
}
