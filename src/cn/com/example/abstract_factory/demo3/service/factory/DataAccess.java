package cn.com.example.abstract_factory.demo3.service.factory;

import cn.com.example.abstract_factory.demo3.service.user.IUserService;
import cn.com.example.abstract_factory.demo3.service.department.IDepartmentService;

import java.lang.reflect.Constructor;
import java.util.ResourceBundle;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class DataAccess {
    //1.通过配置文件拿到两个类的路径.
    static ResourceBundle rb = ResourceBundle.getBundle("cn.com.example.abstract_factory.demo2.data");
    static String userServiceClassName = rb.getString("userService");
    static String departmentServiceClassName = rb.getString("departmentService");

    //2.通过反射机制创建实例.
    public static IUserService createUserService() {
        IUserService userService = null;
        try {
            Class c = Class.forName(userServiceClassName);
            Constructor con = c.getConstructor(null);
            userService = (IUserService) con.newInstance(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userService;
    }

    public static IDepartmentService createDepartmentService() {
        IDepartmentService departmentService = null;
        try {
            Class c = Class.forName(departmentServiceClassName);
            Constructor con = c.getConstructor(null);
            departmentService = (IDepartmentService) con.newInstance(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departmentService;
    }
}
