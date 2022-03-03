package org.example.factorymethod.calculator.factory;


import org.example.factorymethod.calculator.operator.Operator;
import org.example.factorymethod.calculator.operator.OperatorDiv;

public class FactoryDiv implements Factory{
    @Override
    public Operator createOperator() {
        return new OperatorDiv();
    }
}
