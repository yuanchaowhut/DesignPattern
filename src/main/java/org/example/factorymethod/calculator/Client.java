package org.example.factorymethod.calculator;

import org.example.factorymethod.calculator.factory.Factory;
import org.example.factorymethod.calculator.factory.FactoryAdd;
import org.example.factorymethod.calculator.operator.Operator;

/**
 * 工厂方法模式：
 * 定义一个用于创建对象的接口，让工厂子类决定实例化哪个产品对象。
 * 工厂方法模式的核心就是将产品的实例化延迟到工厂子类。
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new FactoryAdd();
        Operator operator = factory.createOperator();
        double result = operator.getResult(100f, 200f);
        System.out.println("运算结果：" + result);
    }
}
