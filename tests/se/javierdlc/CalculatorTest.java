package se.javierdlc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator sut;

    @Before
    public void setup() {
        sut = new Calculator();
    }

    @Test
    public void whenAddingTwoPlusThreeShouldReturnFive() {
        int result = sut.add(2, 3);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void whenTheFirstAddParameterIsNegativeShouldReturnZero() {
        int result = sut.add(-5, 3);
        Assert.assertEquals("Should return zero when first parameter passed to the method is negative number.", result, 0);
    }

    @Test
    public void whenTheSecondAddParameterIsNegativeShouldReturnZero() {
        int result = sut.add(3, -6);
        Assert.assertEquals("Should return zero when second parameter passed to the method is negative number.", result, 0);
    }

    @Test
    public void whenThreeTimesFiveShouldReturnFifteen() {
        int result = sut.multiply(3, 5);
        Assert.assertEquals("Should return fifteen when passed 3 and 5.", result, 15);
    }

    @Test
    public void whenFifteenDividedByFiveShouldReturnThree() {
        int result = sut.divide(15, 5);
        Assert.assertEquals("Should return three when passed 15 and 5", result, 3);
    }
}