package org.example.simplefactory.improve;

/**
 * Created by yuanchao on 2018/3/28.
 */
public class OperatorSub extends Operator {
    @Override
    public double getResult(double num1, double num2) {
        double result = num1-num2;
        return result;
    }
}
