package org.example.factorymethod.calculator.operator;

public class OperatorMul implements Operator{
    @Override
    public double getResult(double a, double b) {
        return a * b;
    }
}
