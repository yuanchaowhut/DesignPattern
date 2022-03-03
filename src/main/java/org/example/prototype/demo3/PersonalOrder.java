package org.example.prototype.demo3;

import java.util.ArrayList;

/**
 * Created by 48608 on 2018/3/5.
 */

public class PersonalOrder implements IOrder {
    private String orderName;
    private int orderNumber;

    @Override
    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public Prototype clonePrototype() {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderName(orderName);
        personalOrder.setOrderNumber(orderNumber);
        return personalOrder;
    }
}
