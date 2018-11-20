package cn.com.example.component.demo1;

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
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        String separator = "";
        for (int i = 0; i < depth; i++) {
            separator += "-";
        }
        System.out.println(separator + this.name);

        for (Company company : children) {
            company.display(depth + 2);  //括号里的参数在本例中决定客户端调用display后，控制台显示几个"-"符号
        }
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + "履行职责，管理本级公司业务");
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}
