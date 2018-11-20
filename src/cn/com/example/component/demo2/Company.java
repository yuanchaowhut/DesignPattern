package cn.com.example.component.demo2;

/**
 * Created by yuanchao on 2018/11/20.
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    protected abstract void display(int depth);

    protected abstract void lineOfDuty();

    protected abstract boolean isLeaf();
}
