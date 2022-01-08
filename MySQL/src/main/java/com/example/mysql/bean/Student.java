package com.example.mysql.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author XGKerwin
 * @since 2022-01-09
 */
public class Student implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 学号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 更新时间
     */
    private LocalDateTime updatime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getUpdatime() {
        return updatime;
    }

    public void setUpdatime(LocalDateTime updatime) {
        this.updatime = updatime;
    }

    @Override
    public String toString() {
        return "Student{" +
        "id=" + id +
        ", name=" + name +
        ", pwd=" + pwd +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", address=" + address +
        ", email=" + email +
        ", updatime=" + updatime +
        "}";
    }
}
