package com.note.miaosha.controller;

import com.note.miaosha.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 18530
 */
@RestController
@RequestMapping("/test")
public class MiaoshaController {

    @RequestMapping("/test")
    public Result test() {
        return Result.success("hello");
    }

}
