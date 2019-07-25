package devops.module.ceshi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class CsController {

    /**
     * @Description 测试
     * @param
     * @return java.lang.String
     * @Author wjq-1041646584@qq.com
     * @Date 2019/7/24
     */
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
