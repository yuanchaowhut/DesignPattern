package org.example.strategy.demo1;

/**
 * Created by yuanchao on 2018/4/19.
 */
public class CashierFactory {
    public static final int PROMOTION_NONE = 0;
    public static final int PROMOTION_DISCOUNT = 1;
    public static final int PROMOTION_MJ = 2;

    public static Cashier createCashier(int prom) {
        Cashier cashier = null;
        if (prom == PROMOTION_NONE) {
            cashier = new CashierNomal();
        } else if (prom == PROMOTION_DISCOUNT) {
            cashier = new CashierDis();
        } else if (prom == PROMOTION_MJ) {
            cashier = new CashierMJ();
        }

        return cashier;
    }
}
