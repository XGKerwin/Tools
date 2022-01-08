package com.example.tool.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 关鑫
 * @date 2022/1/9 星期日
 * @Description com.example.tool.yml
 */
@RestController
public class ControllerYml {

    @Autowired
    private BBB bbb;

    @Autowired
    private Kerwin answerConfig;


    @GetMapping("/getbbb")
    public Object getbbb() {
        List<String> aaa = bbb.getAaa();
        return aaa;
    }

    @GetMapping("/getkerwin")
    public Object getkerwin() {
        List<Kerwin.YM> onstar = answerConfig.getHx();
        return onstar;
    }


}
