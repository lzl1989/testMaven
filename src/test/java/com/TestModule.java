package com;

import com.testproject.service.IPersonService;
import com.testproject.service.ITeacher;
import com.testproject.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
/**
 * 在使用SpringBoot写测试类时遇到报错，大意为找不到SpringBoot的配置，需要在test类中指定启动类的配置
 * 在这里插入图片描述
 * 这是因为测试类所在的包名和SpringBoot启动类所在的包名不一致导致，测试类扫描不到启动类，所以无法启动
 * 想要解决问题其实很简单，
 * 一劳永逸的方法就是将测试类所在的包名和启动类所在的包名保持一致，
 * 或者在测试类上的@SpringBootTest注解上手动添加启动类，
 * 例如：@SpringBootTest(classes = ManageApplication.class)
 */
// 指定启动类
//@SpringBootTest(classes = App.class)
// 或者把测试类所在的包跟启动类所在的包一样
@SpringBootTest
@Slf4j
public class TestModule {

    @Autowired
    IPersonService iPersonService;
    @Autowired
    IUserInfoService iUserInfoService;
//    @Autowired
//    IStudent iStudent;
    @Autowired
    ITeacher iTeacher;

    /**
     * 1.通过配置文件中配置的bean
     * 获取bean对象。然后调用对象方法
     * 这是一种配置Bean的方法
     * <p>
     * 2.通过注解的方式获取Bean
     */
    @Test
    public void testModule() {
        //1.
//        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans/beansconfig.xml");
//        PersonInfo personInfo = applicationContext.getBean("personInfo", PersonInfo.class);
//        personInfo.getPersonName();
        //2.
//        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/beansconfig.xml");
//        HomeInfo personInfoAno= ctx.getBean("homeInfo",HomeInfo.class);
        //3.
//        ApplicationContext applicationContext1= new ClassPathXmlApplicationContext("beans/beansconfig.xml");
//        StudentEntity studentEntity= applicationContext1.getBean("studentEntity",StudentEntity.class);

        //4.
//       iPersonService.UserBuilder();
//          iUserInfoService.selectUserById("22");
//        UserInfoCustom userInfoCustom=UserInfoCustom.builder().name("lzl").build();
//        iUserInfoService.SelectListUserByUserId(userInfoCustom);
//        List<EntityA> list=new ArrayList<>();
//        list.add(EntityA.builder().Code("001").Name("lzl").build());
//        list.add(EntityA.builder().Code("002").Name("zhy").build());
//        iUserInfoService.ListEntityAConvertEntityB(list);
        try {
            iTeacher.requestQuestion();
        } catch (Exception ex) {

        }

    }
}
