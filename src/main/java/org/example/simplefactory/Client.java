package org.example.simplefactory;

import org.example.simplefactory.improve.Operator;
import org.example.simplefactory.improve.OperatorFactory;
import org.junit.Test;

/**
 * Created by yuanchao on 2018/3/28.
 */
public class Client {
    @Test
    public void testGetResult() {
        Operator operator = OperatorFactory.createOperator("*");
        double result = operator.getResult(12, 6);
        System.out.println("result:" + result);
    }
}
