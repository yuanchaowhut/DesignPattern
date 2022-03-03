package org.example.abstractfactory.demo1.factory;


import org.example.abstractfactory.demo1.service.department.DepartmentServiceXML;
import org.example.abstractfactory.demo1.service.department.IDepartmentService;
import org.example.abstractfactory.demo1.service.user.IUserService;
import org.example.abstractfactory.demo1.service.user.UserServiceXML;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class FactoryXML implements IFactory {
    private IUserService userService;
    private IDepartmentService departmentService;

    @Override
    public IUserService createUserService() {
        userService = new UserServiceXML();
        return userService;
    }

    @Override
    public IDepartmentService createDepartmentService() {
        departmentService = new DepartmentServiceXML();
        return departmentService;
    }
}
