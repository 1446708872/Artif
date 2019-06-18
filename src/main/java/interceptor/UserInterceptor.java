package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import model.Student;
import org.apache.struts2.ServletActionContext;

public class UserInterceptor extends MethodFilterInterceptor implements ModelDriven<Student> {

    Student student = new Student();

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println(student.toString());
//        User user = (User)  ServletActionContext.getRequest().getSession().getAttribute("user");
//        if(user != null){
//            return actionInvocation.invoke();
//        }
//        return "toLogin";
        return actionInvocation.invoke();
    }

    @Override
    public Student getModel() {
        return student;
    }
}
