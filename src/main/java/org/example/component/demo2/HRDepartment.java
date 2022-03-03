package org.example.component.demo2;


/**
 * Created by yuanchao on 2018/11/20.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    protected void display(int depth) {
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

    @Override
    protected boolean isLeaf() {
        return true;
    }
}
