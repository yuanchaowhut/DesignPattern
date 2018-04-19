package cn.com.example.simple_factory.basic;

import java.util.ResourceBundle;

/**
 * Created by yuanchao on 2018/3/28.
 */
public class Calculate {

    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("config.num");
        String num1 = rb.getString("num1");
        String num2 = rb.getString("num2");
        String operator = rb.getString("operator");

        double num = getResult(num1, num2, operator);
        System.out.println("运算结果为:"+num);
    }

    public static double getResult(String num1, String num2, String operator) {

        double num_1 = Double.parseDouble(num1);
        double num_2 = Double.parseDouble(num2);
        double result = 0;
        if (operator.equals("+")) {
            result = num_1 + num_2;
        } else if (operator.equals("-")) {
            result = num_1 - num_2;
        } else if (operator.equals("*")) {
            result = num_1 * num_2;
        } else if (operator.equals("/")) {
            result = num_1 / num_2;
        }

        return result;
    }
}
