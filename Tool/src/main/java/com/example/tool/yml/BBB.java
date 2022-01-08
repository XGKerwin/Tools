package com.example.tool.yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/12/23 星期四
 * @Description com.kerwin.tools.读取配置文件
 */
@Component
@ConfigurationProperties(prefix = "bbb")
public class BBB {

    List<String> aaa = new ArrayList<>();
    List<String> ccc = new ArrayList<>();

    public List<String> getAaa() {
        return aaa;
    }

    public void setAaa(List<String> aaa) {
        this.aaa = aaa;
    }

    public List<String> getCcc() {
        return ccc;
    }

    public void setCcc(List<String> ccc) {
        this.ccc = ccc;
    }
}
