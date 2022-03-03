package org.example.abstractfactory.demo2;

import org.example.abstractfactory.demo2.bean.Department;
import org.example.abstractfactory.demo2.bean.User;
import org.example.abstractfactory.demo2.service.department.IDepartmentService;
import org.example.abstractfactory.demo2.factory.DataAccess;
import org.example.abstractfactory.demo2.service.user.IUserService;
import org.junit.Test;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class Client {

    @Test
    public void testUser() {
        User u = new User(); //实体类
        IUserService userService = DataAccess.createUserService();
        userService.addUser(u);
        userService.getUserByName("张三");
    }

    @Test
    public void testDepartment() {
        //切换Mysql数据库，只需要该一行代码，把 new FactoryXml()  换成   new FactoryMysql()  即可.
        Department department = new Department();
        IDepartmentService departmentService = DataAccess.createDepartmentService();
        departmentService.addDepartment(department);
        departmentService.getDepartmentByName("研发部");
    }

}
