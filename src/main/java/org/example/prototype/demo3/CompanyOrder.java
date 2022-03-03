package org.example.prototype.demo3;

/**
 * Created by 48608 on 2018/3/5.
 */

public class CompanyOrder implements IOrder{
    private String orderName;
    private int orderNumber;
    @Override
    public int getOrderNumber() {
        return orderNumber;
    }
    @Override
    public void setOrderNumber(int orderNumber) {
        this.orderNumber=orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public Prototype clonePrototype() {
        CompanyOrder companyOrder=new CompanyOrder();
        companyOrder.setOrderName(orderName);
        companyOrder.setOrderNumber(orderNumber);
        return companyOrder;
    }
}
