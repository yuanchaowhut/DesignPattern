package org.example.factorymethod.leifeng.factory;


import org.example.factorymethod.leifeng.product.Leifeng;
import org.example.factorymethod.leifeng.product.VolLeifeng;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class VolLeifengFactory implements LeifengFactory {
    @Override
    public Leifeng createLeifeng() {
        return new VolLeifeng();
    }
}
