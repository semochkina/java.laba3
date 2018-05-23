package ru.omsk.sveta.example3;

import org.junit.Assert;
import org.junit.Test;
import ru.omsk.sveta.example2.SquareFunction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SquareFunction2Test {
    @Test
    public void test() throws SquareEqException {
        SquareFunction squareFunction = new SquareFunction(2, 7, -4);
        double maxValue = new SquareFunction2(squareFunction).maxValue();
        assertEquals(maxValue, 0.5, SquareFunction.delta);
    }
    @Test(expected = SquareEqException.class)
    public void testNoRoots() throws SquareEqException {
        SquareFunction squareFunction2 = new SquareFunction(3, -1, 7);
        double maxValue2 = new SquareFunction2(squareFunction2).maxValue();
        fail("Baga");
    }
    @Test
    public void testTwoRoots() throws SquareEqException{
        SquareFunction squareFunction3 = new SquareFunction(1, 3, -4);
        double actual = new SquareFunction2(squareFunction3).maxValue();
        assertEquals(1, actual,  SquareFunction.delta);
    }
}
