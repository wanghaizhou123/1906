package com.mr.whz.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

public class DemoEntity {
    private Integer id;

    @Excel(name = "姓名", orderNum = "0", width = 15)
    private String name;

    @Excel(name = "性别", orderNum = "1", width = 15)
    private String sex;

    @Excel(name = "手机", orderNum = "2", width = 15)
    private String phone;

    @Excel(name = "生日", orderNum = "3", format = "yyyy-MM-dd" ,width = 15)
    private Date birthday;



    @Override
    public String toString() {
        return "DemoEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBirthday() {
        return birthday;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}