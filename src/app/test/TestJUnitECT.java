package app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestJUnitECT {

    private int inputA, inputB, inputC;
    private int expected;

    @Parameters
    public static Iterable<Object[]> data()  {
        return Arrays.asList(new Object[][] {
            {-4, -5, -2, 4},
            {30, 60, 40, 2},
            {125, 200, 150, 2},
            {-4, -5, 40, 4},
            {-4, -5, 200, 4},
            {-4, 60, -2, 4},
            {-4, 60, 40, 4},
            {-4, 60, 200, 4},
            {-4, 150, -2, 4},
            {-4, 150, 40, 4},
            {-4, 150, 200, 4},
            {30, -5, -2, 4},
            {30, -5, 40, 4},
            {30, -5, 120, 4},
            {30, 60, -2 , 4},
            {30, 60, 120, 3},
            {30, 150, -2, 4},
            {30, 150, 70, 3},
            {30, 150, 110, 3},
            {125, -5, -2, 4},
            {125, -5, 40, 4},
            {125, -5, 120, 4},
            {125, 60, -2, 4},
            {120, 60, 70, 2},
            {125, 60, 110, 2},
            {125, 150, -3, 4},
            {125, 150, 80, 2}
        });
    }
    public TestJUnitECT(int inputA, int inputB, int inputC, int expected) {
        this.inputA = inputA;
        this.inputB = inputB;
        this.inputC = inputC;
        this.expected = expected;
    }

    @Test
    public void testTriangleType() {
        int actual = app.App.triangleType(inputA, inputB, inputC);
        assertEquals("input:<" + inputA + ", " + inputB + ", " + inputC + ">", expected, actual);
    }

}