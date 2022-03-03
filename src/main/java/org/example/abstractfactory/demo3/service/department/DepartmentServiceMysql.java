package org.example.abstractfactory.demo3.service.department;


import org.example.abstractfactory.demo3.bean.Department;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class DepartmentServiceMysql implements IDepartmentService {
    @Override
    public void addDepartment(Department department) {
        System.out.println("向Mysql数据库中添加部门数据!");

    }

    @Override
    public Department getDepartmentByName(String name) {
        System.out.println("根据部门名从Mysql数据库中取出部门数据!");
        return null;
    }
}
