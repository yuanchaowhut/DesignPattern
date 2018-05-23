package cn.com.example.facade.demo02;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/5/23.
 */
public class Client {

    @Test
    public void testOn() {
        Facade facade = new Facade();
        facade.turnOn();
    }

    @Test
    public void testOff() {
        Facade facade = new Facade();
        facade.turnOff();
    }

    @Test
    public void testDayLight() {
        Facade facade = new Facade();
        facade.dayLight();
    }

    @Test
    public void testNight() {
        Facade facade = new Facade();
        facade.night();
    }
}
