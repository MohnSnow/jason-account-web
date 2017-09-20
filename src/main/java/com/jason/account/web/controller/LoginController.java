package com.jason.account.web.controller;

import com.jason.account.web.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by MengDexin.
 * Date : 17/9/19.
 * Time : 16:24.
 */
@RequestMapping("/login")
public class LoginController extends BaseController{

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Response<String> test(HttpServletRequest request) {
        Response<String> response = suc("test");
        response.setSuccess(true);
        return response;
    }
}
