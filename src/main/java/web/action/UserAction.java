package web.action;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.ActionSupport;
import model.Student;
import org.apache.struts2.ServletActionContext;
import service.UserService;

import javax.servlet.http.HttpSession;


    public class UserAction extends ActionSupport  implements ModelDriven <Student>{
    // 模型驱动
    private Student student = new Student();

    public void setStudent(Student student) { this.student = student; }

    //session
    private HttpSession session = ServletActionContext.getRequest().getSession();

    //注入模型驱动
    @Override
    public Student getModel() {
        return student;
    }

    // 注入service
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //JSON数据
    private String result;
    public String getResult() {
        return result;
    }

    public String login() {
        Integer integer=0;

        if(session.getAttribute("student")!=null){
            integer =4;
            result = integer.toString();
            return "json";
        }

        try {
            Student queryStudent = userService.checkStudent(student);
            if(queryStudent!=null){ ;
                if(student.getPassword().equals(queryStudent.getPassword())){
                    session.setAttribute("student",queryStudent);
                    System.out.println(queryStudent);
                    integer = 0;
                }else {
                    integer = 2;
                }
            }else {
                integer = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            integer=3;
        }
        result = integer.toString();
        return "json";
    }

    public String mian(){
        return "mian";
    }

    public String exit(){
        if(session.getAttribute("student")!=null){
            session.removeAttribute("student");
        }
        return "exit";
    }
}
