package app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestJUnitBVA {

    private int inputA, inputB, inputC;
    private int expected;

    @Parameters
    public static Iterable<Object[]> data()  {
        return Arrays.asList(new Object[][] {
            {30, 40, 50, 2},
            {1, 1, 3, 3},
            {1, 10, 1, 3},
            {20, 1, 1, 3},
            {1, 1, 1, 0},
            {2, 3, 4, 2},
            {2, 2, 11, 3},
            {2, 15, 3, 3},
            {10, 3, 2, 3},
            {100, 100, 50, 1},
            {100, 70, 100, 1},
            {5, 100, 100, 1},
            {100, 100, 100, 0},
            {98, 99, 40, 2},
            {99, 60, 90, 2},
            {65, 97, 95, 2}
        });
    }
    public TestJUnitBVA(int inputA, int inputB, int inputC, int expected) {
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