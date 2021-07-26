package com.testproject.testcontroller;

import com.testproject.annotation.ExcTransacational;
import com.testproject.annotation.MyAnnotation;
import com.testproject.annotation.TestMyAnnotation;
import com.testproject.async.AsyncTest;
import com.testproject.entity.TestUser;
import com.testproject.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OutrepairController {

    /**
     * 获取aplication.yml配置文件的配置信息
     */
    @Value("${testuser.name}")
    private String testUser;

    @Autowired
    private TestUser testUserMod;

    @Autowired
    private AsyncTest asyncTest;

    @Autowired
    private IUserInfoService iUserInfoService;

    /**
     * 多线程异常处理
     */
    @RequestMapping("/getNumber")
    public String getOutRepairNumber(Model model) throws Exception {
        /**
         *捕获全局数据
         */
        log.info(model.asMap().keySet().toString());
        log.info(model.asMap().values().toString());
        log.info("begin");
        //开启线程
        asyncTest.runThreadOne();//线程1
        asyncTest.runThreadTwo();//线程2
        asyncTest.runThreadThree();//线程3
        //打印日志
        log.info("end");

        //自定义注解
        java.lang.reflect.Method[] methods = TestMyAnnotation.class.getMethods();
        for (java.lang.reflect.Method m : methods) { //遍历所有方法
            if (m.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnno = m.getAnnotation(MyAnnotation.class);
                log.info(myAnno.name() + " 会 " + myAnno.abilityNames()[0] + " ," + myAnno.abilityNames()[1]);
            }
        }
        //返回值
        return testUserMod.toString();
    }

    /**
     * 测试事务
     * 自己手动设置异常的话，事务没有回滚，却已经提交了
     *
     * @return
     */
    @RequestMapping("/testTranslation")
    @Transactional
    public String testTranslation() {
        try {
            iUserInfoService.InsertUser();
            Integer integer = Integer.parseInt("q");
            return "事务提交...";
        } catch (Exception e) {
            log.info("发生异常");
            //事务失效，Transactional没有捕获到异常，所以直接提交了
            //可以直接手动设置回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "异常";
        }
    }

    /**
     * 测试环绕注解
     *
     * @return
     */
    @ExcTransacational
    @RequestMapping("/runRoundAnnotation")
    public String runRoundAnnotation() {
        Integer integer = Integer.parseInt("a");
        return "ok";
    }

    /**
     * 开始异步执行, 把异步方法放到这个类当中，异步失效
     * 把异步方法单独放到一个类当中就生效了
     *
     * 异步注解写在当前自己类，有可能aop会失效，无法拦截注解。
     * 所以需要经过代理类调用接口
     *所以需要将异步代码单独抽成一个类调用接口
     */
//    @Async
//    public void sendUserInfo(){
//        log.info("02");
//        try {
//            log.info("正在执行...");
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }


}
