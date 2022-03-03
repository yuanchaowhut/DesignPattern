package org.example.component.demo2;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanchao on 2018/11/20.
 */
public class ConcretCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcretCompany(String name) {
        super(name);
    }


    @Override
    public void lineOfDuty() {
        System.out.println(this.name + "履行职责，管理本级公司业务");
        for (Company company : children) {
            company.lineOfDuty();
        }
    }

    @Override
    protected boolean isLeaf() {
        return false;
    }

    @Override
    protected void display(int depth) {
        String separator = "";
        for (int i = 0; i < depth; i++) {
            separator += "-";
        }
        System.out.println(separator + this.name);

        for (Company company : children) {
            company.display(depth + 2);  //括号里的参数在本例中决定客户端调用display后，控制台显示几个"-"符号
        }
    }

    protected void add(Company company) {
        if (company.isLeaf()) {
            System.out.println(String.format("%s是一个具体职能部门，没有新增下级节点功能", this.name));
        } else {
            children.add(company);
        }
    }

    protected void remove(Company company) {
        if (company.isLeaf()) {
            System.out.println(String.format("%s是一个具体职能部门，无法新增下级节点", this.name));
        } else {
            children.remove(company);
        }
    }
}
