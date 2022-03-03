package org.example.factorymethod.calculator.operator;

public class OperatorDiv implements Operator {
    @Override
    public double getResult(double a, double b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return -1;
        }
        return a / b;
    }
}
