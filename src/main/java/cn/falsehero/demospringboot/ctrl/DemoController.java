package cn.falsehero.demospringboot.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fenghao
 * @Date: 2020/12/06 13:46
 * @Description:
 */
@RestController("/demo")
public class DemoController {

    @GetMapping("/getDemo")
    public String getDemo() {
        return "this is a demo";
    }
}
