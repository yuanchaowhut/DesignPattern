package cn.com.example.abstract_factory.demo3;

import cn.com.example.abstract_factory.demo3.bean.Department;
import cn.com.example.abstract_factory.demo3.bean.User;
import cn.com.example.abstract_factory.demo3.service.department.IDepartmentService;
import cn.com.example.abstract_factory.demo3.service.factory.DataAccess;
import cn.com.example.abstract_factory.demo3.service.user.IUserService;
import cn.com.example.abstract_factory.demo3.service.user.UserServiceXML;
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
        Department department = new Department();
        IDepartmentService departmentService = DataAccess.createDepartmentService();
        departmentService.addDepartment(department);
        departmentService.getDepartmentByName("研发部");
    }

}
