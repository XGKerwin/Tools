package com.example.tool.yml;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/12/23 星期四
 * @Description com.kerwin.tools.读取配置文件
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "kerwin.at")
public class Kerwin {

    private List<YM> hx = Lists.newArrayList();

    @Data
    public static class YM {
        private String number;
        private String name;
        private String pass;
    }

}