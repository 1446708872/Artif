package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import model.Student;
import org.apache.struts2.ServletActionContext;

public class UserInterceptor extends MethodFilterInterceptor{


    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println(ServletActionContext.getRequest().getServletPath());
//        User user = (User)  ServletActionContext.getRequest().getSession().getAttribute("user");
//        if(user != null){
//            return actionInvocation.invoke();
//        }
//        return "toLogin";
        return actionInvocation.invoke();
    }

}
