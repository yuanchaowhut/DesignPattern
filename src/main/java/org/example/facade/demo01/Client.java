package org.example.facade.demo01;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/5/23.
 */
public class Client {

    @Test
    public void testMethodA(){
        Facade facade = new Facade();
        facade.methodA();
    }

    @Test
    public void testMethodB(){
        Facade facade = new Facade();
        facade.methodB();
    }
}
