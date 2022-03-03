package org.example.factorymethod.calculator.factory;


import org.example.factorymethod.calculator.operator.Operator;

public interface Factory {
    Operator createOperator();
}
