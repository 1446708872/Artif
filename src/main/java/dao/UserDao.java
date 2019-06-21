package dao;

import model.Student;

public interface UserDao {
    //查找用户
    public Student queryStudent(Student student);
}
