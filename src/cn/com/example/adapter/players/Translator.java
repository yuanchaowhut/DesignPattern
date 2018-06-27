package cn.com.example.adapter.players;

import cn.com.example.adapter.ForeignCenter;

/**
 * Created by yuanchao on 2018/6/27.
 * 翻译，即适配器类，教练不用对着姚明说话，直接跟翻译说就可以了，翻译告诉姚明怎么做。
 */
public class Translator implements Player {
    private ForeignCenter foreignCenter;

    public Translator(ForeignCenter foreignCenter) {
        this.foreignCenter = foreignCenter;
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
