package com.example.mysql.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author XGKerwin
 * @since 2022-01-09
 */
public class Users implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String usernames;

    private String passwords;

    private String msg;

    private String nikenames;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNikenames() {
        return nikenames;
    }

    public void setNikenames(String nikenames) {
        this.nikenames = nikenames;
    }

    @Override
    public String toString() {
        return "Users{" +
        "id=" + id +
        ", usernames=" + usernames +
        ", passwords=" + passwords +
        ", msg=" + msg +
        ", nikenames=" + nikenames +
        "}";
    }
}
