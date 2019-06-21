package dao.impl;

import dao.UserDao;
import model.Student;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public Student queryStudent(Student student) {
        Student stu;
        try {
            stu = this.getHibernateTemplate().get(Student.class, student.getStuId());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return stu;
    }
}
