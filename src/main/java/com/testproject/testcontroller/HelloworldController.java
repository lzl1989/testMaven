package com.testproject.testcontroller;

import com.testproject.entity.User;
import com.testproject.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestController
@Slf4j
public class HelloworldController {

    /**
     * 常量命名
     */
    public final Integer MAX_AGE_NUMBER = 1000;
    /**
     * volatile 应用在变量上的关键字 禁止内存重排序。保证线程安全。
     */
    private volatile Integer VolNumber=10;

    @Autowired
    private IUserInfoService iUserInfoService;

    /**
     * synchronized 应用在方法上的关键字，保证线程安全
     */
    public synchronized  void synGetUserInfo(){

    }
    /**
     * 插入mysql数据库
     */
    @RequestMapping("/insertUser")
    public String insertUser() {
        iUserInfoService.InsertUser();
        return "插入成功...";
    }

    /**
     * @return
     */
    @RequestMapping("/getUser")
    public String getUser() {
        Integer integer = Integer.parseInt("a");
        return "Hello World by lzl";
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping("/getId")
    public String getId(Integer id) {
        log.info(String.class.getSimpleName());
        log.info(String.class.getName());
        log.info(String.class.getMethods().toString());
        return "01";
    }

    /**
     * 这样的注释快捷键 /** + Enter
     *
     * @param userId
     * @return
     */
    @RequestMapping("/getUserName")
    public String getUserName(String userId) {
        return userId+"ok";
    }

    /**
     * 利用反射机制获取类对象并赋值
     */
    @RequestMapping("/getClassInReflect")
    public void getClassInReflect() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.testproject.entity.User");//获取类型的类
        User user = (User) aClass.newInstance();//执行初始化。就会执行类的无参构造函数
        user.setUserName("lzl");
        user.setUserAge(32);
        log.info(user.toString());
        //获取对象的类型类
        Class<?> aClass1 = Class.forName("com.testproject.testcontroller.HelloworldController");
        //利用反射获取类方法
        Method testReflect = aClass1.getDeclaredMethod("testReflect", String.class, String.class);
        Object object = aClass1.newInstance();//实例化对象
        testReflect.invoke(object, "lzl", "32");
    }

    public void testReflect(String name, String age) {
        log.info("方法执行:" + "名字:" + name + "年龄:" + age);
    }

}
