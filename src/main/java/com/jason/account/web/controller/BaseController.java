package com.jason.account.web.controller;

import com.jason.account.web.entity.Response;
import com.jason.account.web.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by MengDexin.
 * Date : 17/9/19.
 * Time : 14:20.
 */
public class BaseController {
    /**
     * 从request 中获取用户的信息
     * @param request
     * @return
     */
    protected User getUser(HttpServletRequest request) {
        String[] userArray = request.getRemoteUser().split("\\|");
        User user = new User();
        user.setEnName(userArray[0]);
        user.setLoginId(userArray[1]);
        user.setEmployeeId(userArray[2]);
        user.setName(userArray[3]);
        return user;
    }

    protected <T> Response<T> suc(T value){
        Response<T> resp = new Response<T>(value);
        return resp;
    }

    protected <T> Response<T> err(int code, String msg){
        Response<T> resp = new Response<T>();
        resp.setSuccess(false);
        resp.setResultMessage(msg);
        resp.setResultCode(code);
        return resp;
    }

    protected Response err(int code, String s, Object... args){
        String msg = String.format(s, args);
        return err(code, msg);
    }

    protected Response err(String s, Object... args){
        String msg = String.format(s, args);
        Response resp = new Response();
        resp.setSuccess(false);
        resp.setResultMessage(msg);
        return resp;
    }
}
