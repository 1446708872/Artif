package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import model.Student;
import org.apache.struts2.ServletActionContext;

public class UserInterceptor extends MethodFilterInterceptor{

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        Student student = (Student) ServletActionContext.getRequest().getSession().getAttribute("student");
        if(student==null && !ServletActionContext.getRequest().getServletPath().equals("/login")){
            return"login";
        }
        return actionInvocation.invoke();
    }

}