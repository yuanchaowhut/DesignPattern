package cn.com.example.abstract_factory.demo1.service.user;

import cn.com.example.abstract_factory.demo1.bean.User;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class UserServiceMysql implements IUserService {
    @Override
    public void addUser(User u) {
        System.out.println("向Mysql数据库中添加用户数据!");

    }

    @Override
    public User getUserByName(String name) {
        System.out.println("根据姓名从Mysql数据库中取出用户数据!");
        return null;
    }
}
