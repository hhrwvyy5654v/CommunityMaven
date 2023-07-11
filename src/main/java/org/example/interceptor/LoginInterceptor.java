package org.example.interceptor;

import org.example.model.Userinfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Project: CommunityMaven
 * @Package: org.example.interceptor
 * @ClassName: LoginInterceptor
 * @Datetime: 2023/07/11 16:04
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个自定义的拦截器类，实现了HandlerInterceptor接口
 */

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    // preHandle方法是HandlerInterceptor接口中的一个方法，用于在请求处理之前进行拦截处理
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 通过HttpServletRequest对象获取当前用户的登录信息，这里假设登录信息存储在session中，并且键名为"user"
        Userinfo userinfo = (Userinfo) request.getSession().getAttribute("user");
        // 如果用户已登录，即登录信息不为空，则返回true，表示继续执行后续的请求处理逻辑
        if (userinfo != null) {
            return true;
        }
        // 如果用户未登录，即登录信息为空，我们通过HttpServletResponse对象的sendRedirect方法将请求重定向到登录页面。这里使用request.getContextPath()获取当前应用的上下文路径，然后拼接上"/login.html"，表示重定向到登录页面
        response.sendRedirect(request.getContextPath() + "/login.html");
        // 返回false，表示请求被拦截，不再继续执行后续的请求处理逻辑
        return false;
    }

    @Override
    // postHandle是HandlerInterceptor接口中的方法，用于在请求处理之后进行拦截处理
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    // afterCompletion方法是HandlerInterceptor接口中的方法，用于在请求处理之后进行拦截处理
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

}

