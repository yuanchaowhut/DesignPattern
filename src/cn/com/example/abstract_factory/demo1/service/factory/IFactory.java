package cn.com.example.abstract_factory.demo1.service.factory;

import cn.com.example.abstract_factory.demo1.service.department.IDepartmentService;
import cn.com.example.abstract_factory.demo1.service.user.IUserService;

/**
 * Created by yuanchao on 2018/3/29.
 */
public interface IFactory {
    IUserService createUserService();

    IDepartmentService createDepartmentService();
}
