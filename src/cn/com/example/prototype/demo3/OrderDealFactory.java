package cn.com.example.prototype.demo3;

/**
 * Created by 48608 on 2018/3/5.
 */

public class OrderDealFactory {

    /**
     * 订单拆单处理
     * @param order
     */
    public void dealOrder(IOrder order) {
        int number = order.getOrderNumber();
        while (number > 0) {
            System.out.println("原始订单:" + order.hashCode());
            IOrder cloneOrder = (IOrder) order.clonePrototype();
            System.out.println("克隆订单:" + cloneOrder.hashCode());
            cloneOrder.setOrderNumber(number >= 1000 ? 1000 : number);
            System.out.println("newOrder" + cloneOrder.hashCode() + " number:" + cloneOrder.getOrderNumber());
            number -= 1000;
        }
    }
}















