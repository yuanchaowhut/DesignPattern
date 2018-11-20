package cn.com.example.component.demo1;

/**
 * Created by yuanchao on 2018/11/20.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        System.out.println(String.format("%s是一个具体职能部门，没有新增下级节点功能", this.name));
    }

    @Override
    public void remove(Company company) {
        System.out.println(String.format("%s是一个具体职能部门，没有新增下级功能", this.name));
    }

    @Override
    public void display(int depth) {
        String separator = "";
        for (int i = 0; i < depth; i++) {
            separator += "-";
        }
        System.out.println(separator + this.name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s履行职责，员工招聘培训管理", this.name));
    }
}
