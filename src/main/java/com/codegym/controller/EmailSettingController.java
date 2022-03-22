package com.codegym.controller;

import com.codegym.model.EmailSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailSettingController {
    @Autowired
    private EmailSetting emailSetting;
    @GetMapping("/email-setting")
    public ModelAndView showEditPage (){
        ModelAndView modelAndView = new ModelAndView("email-setting");
        modelAndView.addObject("emailSetting", emailSetting);
        return modelAndView;
    }
    @PostMapping("/info")
    public ModelAndView showInfo (@ModelAttribute EmailSetting emailSettingSubmit){
        ModelAndView modelAndView = new ModelAndView("info");
        emailSetting = emailSettingSubmit;
        modelAndView.addObject("emailSetting", emailSetting);
        return modelAndView;
    }
}
