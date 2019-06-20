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
    public Student queryStudent(Student student) {
        Student stu;
        try {
            stu = this.getHibernateTemplate().get(Student.class, student.getStuId());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        System.out.println(stu.getTaotixinxis().toString());
        System.out.println(stu.getClazz().toString());
        return stu;
    }
}
