package com.example.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 用于存储排除拦截的url  （登录/login.html, /css,/js,/img）
     */
    private List<String> urls = new ArrayList<String>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getQueryString());
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("中间");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("之后");
    }
    /*设置能通过的url*/
    public List<String> getUrls() {
        urls.add("/api/test");   //login url请求
        //静态资源
        urls.add("/img/*");
        urls.add("/js/*");
        urls.add("/css/*");
        return urls;
    }
}
