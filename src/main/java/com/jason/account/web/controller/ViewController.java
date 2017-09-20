package com.jason.account.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by MengDexin.
 * Date : 17/9/19.
 * Time : 14:20.
 */
@Controller
@RequestMapping("/view")
public class ViewController extends BaseController {

    @RequestMapping(value = "/{path}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView view(@PathVariable("path") String path){
        ModelAndView view = new ModelAndView("common/framework");
        view.addObject("view", path);
        return view;
    }
}
