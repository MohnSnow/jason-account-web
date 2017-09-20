package com.jason.account.web.entity;

/**
 * Created by MengDexin.
 * Date : 17/9/19.
 * Time : 14:20.
 */
public class User {
    private String enName;
    private String loginId;
    private String employeeId;
    private String name;

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
