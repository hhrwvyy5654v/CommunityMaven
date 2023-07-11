package org.example.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Project: CommunityMaven
 * @Package: org.example.interceptor
 * @ClassName: LoginConfig
 * @Datetime: 2023/07/11 16:04
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个拦截器配置类，用于配置拦截器的拦截规则。
 * 当请求进入系统时，会先经过拦截器的处理，根据配置的拦截规则来判断是否需要拦截该请求。
 * 如果需要拦截，则执行拦截器中的逻辑；如果不需要拦截，则直接进入下一个处理器进行处理
 */

@Configuration  // 注解表示这是一个配置类
public class LoginConfig implements WebMvcConfigurer {
    @Override
    // addInterceptors方法是WebMvcConfigurer接口中的一个方法，用于添加拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        // 创建一个InterceptorRegistration对象，并将自定义的LoginInterceptor拦截器实例添加到注册对象中
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());
        // 调用InterceptorRegistration对象的addPathPatterns方法来设置拦截的路径规则，使用"/**"表示拦截所有的请求
        interceptorRegistration.addPathPatterns("/**");
        // 调用InterceptorRegistration对象的excludePathPatterns方法来设置不拦截的路径规则，这里设置一些不需要拦截的路径，如登录接口、登录页面、静态资源文件等
        interceptorRegistration.excludePathPatterns(
                "/loginIn",
                "/**/login.html",
                "/**/*.js",
                "/**/*.css",
                "/**/images/*.*"
        );
    }
}

