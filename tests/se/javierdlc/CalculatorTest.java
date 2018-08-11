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

    @Test
    public void whenTheFirstAddParameterIsNegativeShouldReturnZero(){
        Calculator sut = new Calculator();
        int result = sut.add(-5, 3);
        Assert.assertEquals("Should return zero when negative numbers is passed to the method.",result, 0);
    }
}