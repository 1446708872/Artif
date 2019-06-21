package service.impl;

import dao.UserDao;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 判断用户是否存在
     * 判断账户用户密码是否正确
     * 1：学号错误
     * 2：密码错误
     * 3：登陆
     */
    @Override
    public Student checkStudent(Student student) {
        return userDao.queryStudent(student);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
