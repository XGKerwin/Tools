package com.example.mysql;

import com.example.mysql.bean.Emp;
import com.example.mysql.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MysqlApplicationTests {

    @Autowired
    private EmpMapper mapper;

    @Test
    void contextLoads() {
        List<Emp> emps = mapper.queryAll();
        System.out.println(emps);
    }

}
