package com.example.mysql.controller;


import com.example.mysql.bean.Emp;
import com.example.mysql.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author XGKerwin
 * @since 2022-01-09
 */
@Controller
@RequestMapping("/emp")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {}, allowCredentials = "true")
public class EmpController {

    @Autowired
    private EmpMapper empMapper;

    @GetMapping("EmpAll")
    @ResponseBody
    public List<Emp> queryAll(){
        System.out.println("asd");
        List<Emp> emps = empMapper.queryAll();
        return emps;
    }


}

