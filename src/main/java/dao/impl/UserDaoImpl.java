package dao.impl;

import dao.UserDao;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public Student checkStudent(Student student) {
        Student stu;
        try {
          stu = this.getHibernateTemplate().get(Student.class, student.getUsername());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return student;
    }
}
