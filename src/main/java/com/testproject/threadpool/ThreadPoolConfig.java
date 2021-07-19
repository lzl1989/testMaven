package com.testproject.threadpool;

import com.testproject.exception.MyUncaughtExceptionHandler;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


/**
 * @Configuration 注解的作用类似配置文件。就相当于这个类是配置类
 */
@Configuration
// 启动类已经加上这个注解
//@EnableAsync
public class ThreadPoolConfig implements AsyncConfigurer {
    /**
     * 每秒需要多少个线程处理?
     * tasks/(1/taskcost)
     */
    private int corePoolSize = 3;

    /**
     * 线程池维护线程的最大数量
     * (max(tasks)- queueCapacity)/(1/taskcost)
     */
    private int maxPoolSize = 3;

    /**
     * 缓存队列
     * (coreSizePool/taskcost)*responsetime
     */
    private int queueCapacity = 10;

    /**
     * 允许的空闲时间
     * 默认为60
     */
    private int keepAlive = 100;

    /**
     * 这个Bean注解的作用就是把 TaskExecutor 定义为一个对象。spring会把TaskExecutor对象实例化到容器当中。
     * 实例化之后，其他能用到这个类对象的时候就会直接使用
     */
    @Bean("testExecutor")
    public TaskExecutor testExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置核心线程数
        executor.setCorePoolSize(corePoolSize);
        // 设置最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        // 设置队列容量
        executor.setQueueCapacity(queueCapacity);
        // 设置允许的空闲时间（秒）
        //executor.setKeepAliveSeconds(keepAlive);
        // 设置默认线程名称
        executor.setThreadNamePrefix("thread-");
        // 设置拒绝策略rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 等待所有任务结束后再关闭线程池
        executor.setWaitForTasksToCompleteOnShutdown(true);
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
                 return new MyUncaughtExceptionHandler();
             }


}
