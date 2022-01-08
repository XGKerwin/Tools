package com.example.mysql.mapper;

import com.example.mysql.bean.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author XGKerwin
 * @since 2022-01-09
 */

public interface EmpMapper extends BaseMapper<Emp> {

    List<Emp> queryAll();


}
