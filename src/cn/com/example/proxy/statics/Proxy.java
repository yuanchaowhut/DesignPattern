package cn.com.example.proxy.statics;

/**
 * Created by yuanchao on 2018/4/27.
 */
public class Proxy implements GiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolates() {
        gg.giveChocolates();
    }
}
