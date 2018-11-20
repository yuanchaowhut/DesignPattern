package cn.com.example.component.demo1;

import cn.com.example.component.demo1.ConcretCompany;
import cn.com.example.component.demo1.FinanceDepartment;
import cn.com.example.component.demo1.HRDepartment;

/**
 * Created by yuanchao on 2018/11/20.
 */
public class Client {
    public static void main(String[] args) {
        ConcretCompany root = new ConcretCompany("北京总公司");
        root.add(new HRDepartment("北京总公司人力资源部"));
        root.add(new FinanceDepartment("北京总公司财务部"));

        ConcretCompany compA = new ConcretCompany("上海华东分公司");
        compA.add(new HRDepartment("华东分公司人力资源部"));
        compA.add(new FinanceDepartment("华东分公司财务部"));

        ConcretCompany compA1 = new ConcretCompany("南京办事处");
        compA1.add(new HRDepartment("南京办事处人力资源部"));
        compA1.add(new FinanceDepartment("南京办事处财务部"));

        ConcretCompany compA2 = new ConcretCompany("杭州办事处");
        compA2.add(new HRDepartment("杭州办事处人力资源部"));
        compA2.add(new FinanceDepartment("杭州办事处财务部"));

        compA.add(compA1);
        compA.add(compA2);
        root.add(compA);


        root.display(1);
        root.lineOfDuty();
    }
}
