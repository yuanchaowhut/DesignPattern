package org.example.simplefactory.improve;

/**
 * Created by yuanchao on 2018/3/28.
 */
//简单工厂模式. 工厂模式一般都定义静态方法,方便调用.
//由于一个工厂方法要能够实例化多个Operator的子类,故用其父类Operator来接收.
//其调用getResult方法时,会调用该子类已经重写了的方法.
//缺点：不符合开闭原则

public class OperatorFactory {
    public static Operator createOperator(String opt){

        Operator operator = null; //先声明一个实例变量.

        if (opt.equals("+")) {
            operator = new OperatorAdd();
        } else if (opt.equals("-")) {
            operator = new OperatorSub();
        } else if (opt.equals("*")) {
            operator = new OperatorMul();
        } else if (opt.equals("/")) {
            operator = new OperatorDiv();
        }

        return operator;
    }
}