package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CowTest {
    @Test
    public void speakTest() {
        Cow cow = new Cow();
        String expected = "Moo!";
        String actual = cow.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nullaryCowTest() {
        Cow cow = new Cow();
        String expected = "MooMoo";
        cow.setName(expected);
        String actual = cow.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void constructorCowTest() {
        Cow cow = new Cow("BennyBoy");
        String expected = "BennyBoy";
        String actual = cow.getName();
        Assert.assertEquals(expected, actual);
    }
}
