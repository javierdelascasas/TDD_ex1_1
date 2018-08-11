package se.javierdlc;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void whenAddingTwoPlusThreeShouldReturnFive() {
        Calculator sut = new Calculator();
        int result = sut.add(2, 3);
        Assert.assertEquals(result, 5);
    }
}