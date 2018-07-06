package com.wyait.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 自定义静态资源映射路径和静态资源存放路径
 */
@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * 在Spring添加拦截器之前先创建拦截器对象，这样就能在Spring映射这个拦截器前，把拦截器中的依赖注入的对象给初始化完成了。
	 * </br>避免拦截器中注入的对象为null问题。
	 * @return
	 */
	/*@Bean
	public SecurityInterceptor getSecurityInterceptor(){
		return new SecurityInterceptor();
	}*/

	/**
	 * 添加自定义静态资源映射路径和静态资源存放路径(图片)
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		//配置中的file:表示是一个具体的硬盘路径，其他的配置指的是系统环境变量
		registry.addResourceHandler("/img/**").addResourceLocations("file:D:/demo-images/");
		super.addResourceHandlers(registry);
	}

	/**
	 * 添加拦截器
	 * @param registry
	 */
	/*@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个拦截器链
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(getSecurityInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}*/

}
