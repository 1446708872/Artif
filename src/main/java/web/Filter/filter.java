package web.Filter;

import model.Student;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class filter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;

        Student student = (Student) httpServletRequest.getSession().getAttribute("student");
        String url = httpServletRequest.getRequestURI();

        if(student == null && !url.endsWith("login.jsp")){
                httpServletRequest.getRequestDispatcher("/login.jsp").forward(request, response);
        }else {
            if(!url.endsWith("mian.jsp")){
                chain.doFilter(httpServletRequest, httpServletResponse);
            }
            return;
        }
    }

    @Override
    public void destroy() {

    }
}