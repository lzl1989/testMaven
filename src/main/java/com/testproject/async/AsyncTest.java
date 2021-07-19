package com.testproject.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Slf4j
public class AsyncTest {

    public static Random random = new Random();
    /**
     * 开始异步执行, 如果配置中存在线程池，会拿当前线程池。
     * 不用指定用哪个线程池,如果多个线程池。会自动选择一个
     */

    @Async("testExecutor")
    public void runThreadOne() throws Exception {
        log.info("第一个");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成一，耗时：" + (end - start) + "毫秒");
    }
    /**
     * 定义返回异常。这样可以捕获全局异常，输出到前台
     * 如果不定义返回异常，只能在线程异常日志中查看，前台无法捕获异常
     *
     * 《两种线程异常捕获方法》
     * 第一种: 没有返回值的异常。直接在线程池中定义异常日志，然后输出。但是全局异常无法捕获。
     * 第二种: 有返回值的异常。AsyncResult<String>，返回类型。这样会捕获全局异常，然后输出到前台。同时不会再执行其他线程
     */
    @Async("testExecutor")
    public void   runThreadTwo()throws Exception{
//        Integer integer=Integer.parseInt("a");
        log.info("第二个");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成二，耗时：" + (end - start) + "毫秒");
//        return new AsyncResult<>(null);
    }

    @Async("testExecutor")
    public void runThreadThree()throws Exception{
        log.info("第三个");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成三，耗时：" + (end - start) + "毫秒");
    }

}
