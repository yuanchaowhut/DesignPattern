package cn.com.example.abstract_factory.demo2.service.department;

import cn.com.example.abstract_factory.demo2.bean.Department;

/**
 * Created by yuanchao on 2018/3/29.
 */
public interface IDepartmentService {
    void addDepartment(Department department);

    Department getDepartmentByName(String name);
}
