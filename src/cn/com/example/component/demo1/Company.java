package cn.com.example.component.demo1;

/**
 * Created by yuanchao on 2018/11/20.
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);                 //增加枝节点

    public abstract void remove(Company company);              //删除枝节点

    public abstract void display(int depth);                   //显示枝节点

    public abstract void lineOfDuty();                         //履行职责
}
