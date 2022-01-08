package com.example.mysql.service.impl;

import com.example.mysql.bean.Emp;
import com.example.mysql.mapper.EmpMapper;
import com.example.mysql.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XGKerwin
 * @since 2022-01-09
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
