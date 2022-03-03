package org.example.abstractfactory.demo1.service.department;


import org.example.abstractfactory.demo1.bean.Department;

/**
 * Created by yuanchao on 2018/3/29.
 */
public interface IDepartmentService {
    void addDepartment(Department department);

    Department getDepartmentByName(String name);
}
