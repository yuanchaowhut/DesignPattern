package cn.com.example.flyweight.demo01;

/**
 * Created by yuanchao on 2019/1/7.
 */
public class Client {

    public static void main(String[] args) {
        int flag = 100;
        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operation(--flag);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--flag);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--flag);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--flag);
    }
}
