package web.action;

import com.opensymphony.xwork2.ModelDriven;
import model.Student;
import net.sf.json.JSONArray;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONObject;
import org.apache.struts2.ServletActionContext;
import service.UserService;


public class UserAction extends ActionSupport implements ModelDriven <Student>{
    // 模型驱动
    private Student student = new Student();
    @Override
    public Student getModel() {
        return student;
    }

    // 注入service
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private String result;

    public String login() {
        System.out.println(student);
        try {
            Integer size = userService.checkStudent(student);
            JSONArray json = JSONArray.fromObject(size);
            result = json.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }


    public String getResult() {
        return result;
    }

}
