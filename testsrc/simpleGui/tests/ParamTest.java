package simpleGui.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamTest {
    private int primeNumber;
    private int expectedValidation;

    @Before
    public void initialize() {
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments from parameters we defined
    public ParamTest(int primeNumber, int expectedValidation) {
        this.primeNumber = primeNumber;
        this.expectedValidation = expectedValidation;
    }

    @Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { 2, 2 },
                { 6, 5 },
                { 19, 19 },
                { 22, 22 }
        });
    }

    // This test will run 4 times since we have 4 parameters defined
    @Test
    public void testPrimeNumberValidator() {
        assertEquals(expectedValidation, primeNumber);
    }
}