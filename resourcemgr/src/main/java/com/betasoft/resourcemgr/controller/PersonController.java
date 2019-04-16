package com.betasoft.resourcemgr.controller;

import com.betasoft.resourcemgr.domain.Person;
import com.betasoft.resourcemgr.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 人员控制层
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    /**
     * 创建人
     * @return
     */
//   @RequestMapping(value="create",method = RequestMethod.POST)
//    public String createPerson(@RequestBody Person person){
//       personService.create(person);
//        return "";
//    }
    @RequestMapping("/hello")
    public  String hello(Model model){
        model.addAttribute("hello","hello wold!");
       return "index";
    }
}
