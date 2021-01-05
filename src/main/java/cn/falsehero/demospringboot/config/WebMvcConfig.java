package cn.falsehero.demospringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: fenghao
 * @Date: 2021/01/05 20:46
 * @Description:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 跨域问题
     * @param registry CorsRegistry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 可限制哪个请求可以通过跨域
        registry.addMapping("/**")
                // 可限制固定请求头可以通过跨域
                .allowedHeaders("*")
                // 可限制固定methods可以通过跨域
                .allowedMethods("*")
                // 可限制访问ip可以通过跨域
                .allowedOrigins("*")
                // 是否允许发送cookie
                .allowCredentials(true)
                .exposedHeaders(HttpHeaders.SET_COOKIE);
    }
}
