package com.buchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by weichunlong on 16/11/24.
 */

@Controller
public class BaseController {

    @RequestMapping(value="/sherlock_begin")
    public ModelAndView begin()throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/main");
        return mv;
    }
}
