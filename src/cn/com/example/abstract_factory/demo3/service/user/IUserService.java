package cn.com.example.abstract_factory.demo3.service.user;

import cn.com.example.abstract_factory.demo3.bean.User;

/**
 * Created by yuanchao on 2018/3/29.
 */
public interface IUserService {
    void addUser(User u);

    User getUserByName(String name);
}
