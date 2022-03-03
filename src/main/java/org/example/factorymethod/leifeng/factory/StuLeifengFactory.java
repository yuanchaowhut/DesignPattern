package org.example.factorymethod.leifeng.factory;


import org.example.factorymethod.leifeng.product.Leifeng;
import org.example.factorymethod.leifeng.product.StuLeifeng;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class StuLeifengFactory implements LeifengFactory {
    @Override
    public Leifeng createLeifeng() {
        return new StuLeifeng();
    }
}
