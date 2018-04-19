package cn.com.example.facoty_method.leifeng.product;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class VolLeifeng implements Leifeng{
    @Override
    public void washClothes() {
        System.out.println("社区志愿者洗衣服!");

    }

    @Override
    public void swap() {
        System.out.println("社区志愿者扫地!");
    }

    @Override
    public void cook() {
        System.out.println("社区志愿者做饭!");

    }
}
