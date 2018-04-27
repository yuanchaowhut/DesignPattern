package cn.com.example.proxy.statics;

/**
 * Created by yuanchao on 2018/4/27.
 */
public class Pursuit implements GiveGift {
    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + ", 给你洋娃娃！");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ", 给你鲜花！");
    }

    @Override
    public void giveChocolates() {
        System.out.println(mm.getName() + ", 给你巧克力！");
    }
}
