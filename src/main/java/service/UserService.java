package service;

import model.Student;

public interface UserService {
    //判断用户是否存在
    public Student checkStudent(Student student);

}
