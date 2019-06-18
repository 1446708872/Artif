package dao;

import model.Student;

public interface UserDao {
    //判断用户是否存在
    public Student checkStudent(Student student);
}
