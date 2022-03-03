package org.example.facade.demo02;

/**
 * Created by yuanchao on 2018/5/23.
 */
public class Facade {
    private Light light;
    private Fan fan;
    private Televison televison;
    private AirConditioner airConditioner;

    public Facade() {
        light = new Light();
        fan = new Fan();
        televison = new Televison();
        airConditioner = new AirConditioner();
    }

    public void turnOn() {
        light.turnOn();
        fan.turnOn();
        televison.turnOn();
        airConditioner.turnOn();
    }

    public void turnOff() {
        light.turnOff();
        fan.turnOff();
        televison.turnOff();
        airConditioner.turnOff();
    }

    //白天开空调和电视
    public void dayLight() {
        televison.turnOn();
        airConditioner.turnOn();
    }

    //晚上开电风扇、灯和电视
    public void night() {
        fan.turnOn();
        light.turnOn();
        televison.turnOn();
    }
}
