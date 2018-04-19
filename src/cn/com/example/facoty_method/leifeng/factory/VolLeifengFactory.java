package cn.com.example.facoty_method.leifeng.factory;

import cn.com.example.facoty_method.leifeng.product.Leifeng;
import cn.com.example.facoty_method.leifeng.product.VolLeifeng;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class VolLeifengFactory implements LeifengFactory {
    @Override
    public Leifeng createLeifeng() {
        return new VolLeifeng();
    }
}
