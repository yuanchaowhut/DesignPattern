package org.example.factorymethod.leifeng;

import org.example.factorymethod.leifeng.factory.LeifengFactory;
import org.example.factorymethod.leifeng.factory.StuLeifengFactory;
import org.example.factorymethod.leifeng.product.Leifeng;
import org.junit.Test;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class Client {

    @Test
    public void test(){
        //需求:假设有3个学生要学雷锋帮助老人.

        //1.创建学生雷锋工厂,用抽象的雷锋工厂对象接收.
        LeifengFactory factory = new StuLeifengFactory();

        //2.创建3个学雷锋的学生对象.=>用抽象的雷锋对象接收即可.
        Leifeng stu1 = factory.createLeifeng();
        Leifeng stu2 = factory.createLeifeng();
        Leifeng stu3 = factory.createLeifeng();

        //3.让学生1洗衣服,学生2扫地,学生3煮饭.
        stu1.washClothes();
        stu2.swap();
        stu3.cook();

        //对比简单工厂模式,就是将实例化那个类的逻辑判断抽象出来,形成单独的子类工厂类.这些工厂类分别对应不同的类.
        //同样的需求,如果按照简单工厂的模式,客户端代码:
		/*
		 * Leifeng stu1 = LeifengFactory.createLeifeng("学生");
		   Leifeng stu2 = LeifengFactory.createLeifeng("学生");
		   Leifeng stu3 = LeifengFactory.createLeifeng("学生");
		   代码有重复的嫌疑.
		*/
    }
}
