package cn.falsehero.demospringboot.ctrl;

import cn.falsehero.demospringboot.basic.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fenghao
 * @Date: 2020/12/06 13:46
 * @Description:
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/getDemo")
    public Result<String> getDemo() {
        Result<String> result = Result.newInstance();
        result.setObject("this is demo;;;");
        return result;
    }

    @PostMapping("/postDemo")
    public Result<String> postDemo() {
        Result<String> result = Result.newInstance();
        result.setObject("this is post");
        return result;
    }
}
