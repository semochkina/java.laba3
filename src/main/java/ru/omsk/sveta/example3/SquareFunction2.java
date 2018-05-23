package ru.omsk.sveta.example3;

import ru.omsk.sveta.example2.SquareFunction;

public class SquareFunction2 {
    private SquareFunction squareFunction;

    public SquareFunction2(SquareFunction squareFunction) {
        this.squareFunction = squareFunction;
    }

    public double maxValue() throws SquareEqException {
        double[] values = squareFunction.calculation();
        if (values.length == 0) {
            throw new SquareEqException();
        }
        return values[0] > values[1] ? values[0] : values[1];
    }
}
