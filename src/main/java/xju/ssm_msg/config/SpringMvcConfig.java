package xju.ssm_msg.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@ComponentScan("xju.ssm_msg.controller")
public class SpringMvcConfig implements WebMvcConfigurer {

    //视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
//        WebMvcConfigurer.super.configureViewResolvers(registry);

    registry.jsp("/pages/", ".jsp");
    }


    //配置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
    }
    //开启静态资源处理

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //上传解析器
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("UTF-8");
        return commonsMultipartResolver;
    }
}
