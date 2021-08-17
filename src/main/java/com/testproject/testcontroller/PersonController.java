package com.testproject.testcontroller;

import com.testproject.common.ApiResponse;
import com.testproject.entity.EntityB;
import com.testproject.entityreq.AssertInfoReq;
import com.testproject.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Slf4j
public class PersonController {
    @Autowired
    IPersonService iPersonService;

    @RequestMapping("/InsertPerson")
    public void InsertPerson() {
        iPersonService.InsertPerson();
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/TestAssert",method = RequestMethod.POST)
    public ApiResponse TestAssert(@RequestBody AssertInfoReq testAssertReq){
//        AssertUtil.assertTrue(testAssertReq.getName().equals("1"),100,null);
        log.info("参数值:"+testAssertReq.toString());
        return new ApiResponse(1,"success","返回数据");
    }

    @RequestMapping(value = "/TestResponseTime")
    public ApiResponse TestResponseTime(){
        SimpleDateFormat timeNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        EntityB entityB=EntityB.builder().build();
        entityB.setNameShort("lzl");
        entityB.setCodeShort("01");
        entityB.setCreateTime(new Date());
        entityB.setShortTime(new Date());
        ApiResponse apiResponse= ApiResponse.builder().build();
        apiResponse.setData(entityB);
        apiResponse.setMsg("success");
        return  apiResponse;

    }
}
