package cn.com.example.abstract_factory.demo2.service.factory;


import cn.com.example.abstract_factory.demo2.service.department.DepartmentServiceMysql;
import cn.com.example.abstract_factory.demo2.service.department.DepartmentServiceXML;
import cn.com.example.abstract_factory.demo2.service.department.IDepartmentService;
import cn.com.example.abstract_factory.demo2.service.user.IUserService;
import cn.com.example.abstract_factory.demo2.service.user.UserServiceMysql;
import cn.com.example.abstract_factory.demo2.service.user.UserServiceXML;

/**
 * Created by yuanchao on 2018/3/29.
 * 简单工厂-这里因为数据库种类有限，常用数据库更是有限。
 */
public class DataAccess {
    //这里用常量模拟配置文件.当需要切换数据库时,把另一个注释打开,当前注释注释掉.
    private static final String db = "XML";
    //private statics final String db = "Mysql";

    private static IUserService userService;
    private static IDepartmentService departmentService;

    public static IUserService createUserService(){
        if(db.equals("XML")){
            userService = new UserServiceXML();
        }else if(db.equals("Mysql")){
            userService = new UserServiceMysql();
        }

        return userService;
    }

    public static IDepartmentService createDepartmentService(){
        if(db.equals("XML")){
            departmentService = new DepartmentServiceXML();
        }else if(db.equals("Mysql")){
            departmentService = new DepartmentServiceMysql();
        }

        return departmentService;
    }
}
