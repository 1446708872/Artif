package service.impl;

import dao.UserDao;
import model.Student;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 判断用户是否存在
     * 判断账户用户密码是否正确
     */
    @Override
    public int checkStudent(Student student) {
        return userDao.checkStudent(student);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
