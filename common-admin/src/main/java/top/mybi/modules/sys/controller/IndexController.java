package top.mybi.modules.sys.controller;

import top.mybi.common.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页提示
 *
 * @author Mustang mustang2247@gmail.com
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public Result<String> index(){
        String tips = "你好，common-admin已启动，请启动common-ui，才能访问页面！";
        return new Result<String>().ok(tips);
    }
}
