package com.dtflys.forest.springboot.test.service.impl;

import com.dtflys.forest.http.ForestResponse;
import com.dtflys.forest.springboot.test.client0.BeastshopClient;
import com.dtflys.forest.springboot.test.service.TestService;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

/**
 * @author gongjun[dt_flys@hotmail.com]
 * @since 2021-03-23 23:04
 */
@Component
public class TestServiceImpl implements TestService {

    @Resource
    private BeastshopClient beastshopClient;

    public TestServiceImpl() {
        System.out.println("创建 TestService");
    }

    @Override
    public ForestResponse<String> shops() {
        return beastshopClient.shops();
    }

    public String testRetry() {
        return beastshopClient.testRetry();
    }
}
