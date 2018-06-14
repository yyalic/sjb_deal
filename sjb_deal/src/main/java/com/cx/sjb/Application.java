package com.cx.sjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.cx.sjb.*")
public class Application extends SpringBootServletInitializer
{
    /**
     * @return void
     * @author Administrator
     * @Descriotion
     * @Date 17:43 2018/4/20
     * @Param [args]
     **/
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(Application.class);
    }
}
