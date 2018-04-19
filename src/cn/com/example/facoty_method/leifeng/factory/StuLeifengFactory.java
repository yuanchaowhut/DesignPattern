package cn.com.example.facoty_method.leifeng.factory;

import cn.com.example.facoty_method.leifeng.product.Leifeng;
import cn.com.example.facoty_method.leifeng.product.StuLeifeng;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class StuLeifengFactory implements LeifengFactory {
    @Override
    public Leifeng createLeifeng() {
        return new StuLeifeng();
    }
}
