package org.example.factorymethod.calculator.factory;


import org.example.factorymethod.calculator.operator.Operator;
import org.example.factorymethod.calculator.operator.OperatorAdd;

public class FactoryAdd implements Factory{
    @Override
    public Operator createOperator() {
        return new OperatorAdd();
    }
}
