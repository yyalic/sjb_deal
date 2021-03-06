package com.cx.sjb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * Created by Administrator on 2018/4/28.
 */
@Configuration
@EnableAsync
public class ThreadPoolConfig
{
    @Bean
    public TaskExecutor taskExecutor()
    {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        // 设置核心线程数
        executor.setCorePoolSize(1);

        // 设置最大线程数
        executor.setMaxPoolSize(2);

        // 设置队列容量
        executor.setQueueCapacity(200000);

        // 设置线程活跃时间（秒）
        executor.setKeepAliveSeconds(3000);

        // 设置默认线程名称
        executor.setThreadNamePrefix("sjb-");

        // 设置拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return executor;
    }
}
