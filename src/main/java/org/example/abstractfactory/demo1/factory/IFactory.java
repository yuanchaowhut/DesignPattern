package org.example.abstractfactory.demo1.factory;


import org.example.abstractfactory.demo1.service.department.IDepartmentService;
import org.example.abstractfactory.demo1.service.user.IUserService;

/**
 * Created by yuanchao on 2018/3/29.
 */
public interface IFactory {
    IUserService createUserService();

    IDepartmentService createDepartmentService();
}
