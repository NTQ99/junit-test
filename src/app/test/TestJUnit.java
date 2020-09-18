package app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestJUnit {

    private int inputA, inputB, inputC;
    private int expected;

    @Parameters
    public static Iterable<Object[]> data()  {
        return Arrays.asList(new Object[][] {
            {5, 5, 5, 0},
            {0, 0, 0, 4},
            {-4, -4, -4, 4},
            {7, 7, 4, 1},
            {2, 2, 0, 4},
            {4, 4, -3, 4},
            {-3, -3, 2, 4},
            {0, 0, 5, 4},
            {3, 6, 8, 2},
            {3, 4, 5, 2},
            {2, 3, 7, 3},
            {1, 0, 2, 4},
            {1, -3, 2, 4},
            {-1, 0, 2, 4},
            {-1, -1, 5, 4},
            {0, 0, 2, 4},
            {-6, 0, 0, 4}
        });
    }
    public TestJUnit(int inputA, int inputB, int inputC, int expected) {
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