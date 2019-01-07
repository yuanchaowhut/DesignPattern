package cn.com.example.flyweight.demo02;

/**
 * Created by yuanchao on 2019/1/7.
 */
public class ConcreteWebSite extends WebSite {
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类: " + this.name);
    }
}
