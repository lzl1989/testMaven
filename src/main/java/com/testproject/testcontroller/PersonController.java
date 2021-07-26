package com.testproject.testcontroller;

import com.testproject.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    IPersonService iPersonService;

    @RequestMapping("/InsertPerson")
    public void InsertPerson() {
        iPersonService.InsertPerson();
    }
}
