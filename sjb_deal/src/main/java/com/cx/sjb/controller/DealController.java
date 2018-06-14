package com.cx.sjb.controller;

import com.cx.sjb.model.Demo;
import com.cx.sjb.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2018/6/12.
 */
@Controller
@RequestMapping(value = "/deal")
public class DealController
{
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/login")
    public ModelAndView index(ModelAndView modelAndView)
    {
        modelAndView.setViewName("deal");
        List<String> userList = new ArrayList<String>();
        userList.add("admin");
        userList.add("user1");
        userList.add("user2");
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }
    @RequestMapping(value = "/insert")
    @ResponseBody
    public String insert(String name)
    {
        demoService.insert(new Demo(name));
        return "success";
    }
}
