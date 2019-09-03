package com.sim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author:
 * @Date: 2019/2/26 15:18
 * @Version 0.0.1
 */
@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/hello")
    public ModelAndView sayHelloWorld(ModelAndView model){
        model.setViewName("index");
        return model;
    }
}
