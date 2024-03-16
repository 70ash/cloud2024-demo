package com.forzlp.pay.controller;

import com.forzlp.common.convention.result.Result;
import com.forzlp.common.convention.result.Results;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 70ash
 * @Date 2024/3/16 18:28
 * @Description:
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/get/info")
    public Result getInfo(@Value("${test.info}") String testInfo) {
        return Results.success("testInfo: " + testInfo + port);
    }
}
