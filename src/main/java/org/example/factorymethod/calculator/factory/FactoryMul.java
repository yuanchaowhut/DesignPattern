package org.example.factorymethod.calculator.factory;


import org.example.factorymethod.calculator.operator.Operator;
import org.example.factorymethod.calculator.operator.OperatorMul;

public class FactoryMul implements Factory{
    @Override
    public Operator createOperator() {
        return new OperatorMul();
    }
}
