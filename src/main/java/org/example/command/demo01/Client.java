package org.example.command.demo01;

/**
 * Created by yuanchao on 2018/12/24.
 * 路边摊烧烤--紧耦合设计
 */
public class Client {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeChickenWing();
        barbecuer.bakeMutton();
        barbecuer.bakeMutton();
        barbecuer.bakeChickenWing();
    }
}
