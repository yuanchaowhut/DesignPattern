package cn.com.example.abstract_factory.demo1.service.factory;

import cn.com.example.abstract_factory.demo1.service.department.DepartmentServiceXML;
import cn.com.example.abstract_factory.demo1.service.department.IDepartmentService;
import cn.com.example.abstract_factory.demo1.service.user.IUserService;
import cn.com.example.abstract_factory.demo1.service.user.UserServiceXML;

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
