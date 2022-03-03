package org.example.abstractfactory.demo1.factory;


import org.example.abstractfactory.demo1.service.department.DepartmentServiceMysql;
import org.example.abstractfactory.demo1.service.department.IDepartmentService;
import org.example.abstractfactory.demo1.service.user.IUserService;
import org.example.abstractfactory.demo1.service.user.UserServiceMysql;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class FactoryMysql implements IFactory {
    private IUserService userService;
    private IDepartmentService departmentService;

    @Override
    public IUserService createUserService() {
        userService = new UserServiceMysql();
        return userService;
    }

    @Override
    public IDepartmentService createDepartmentService() {
        departmentService = new DepartmentServiceMysql();
        return departmentService;
    }
}
