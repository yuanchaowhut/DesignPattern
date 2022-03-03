package org.example.factorymethod.calculator.factory;


import org.example.factorymethod.calculator.operator.Operator;
import org.example.factorymethod.calculator.operator.OperatorSub;

public class FactorySub implements Factory{
    @Override
    public Operator createOperator() {
        return new OperatorSub();
    }
}
