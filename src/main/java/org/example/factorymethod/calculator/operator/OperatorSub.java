package org.example.factorymethod.calculator.operator;

public class OperatorSub implements Operator{
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}
