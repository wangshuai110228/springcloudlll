package com.lll.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        //第一个参数 url 指服务端的服务名称/方法名?参数传参  第二个参数指返回值的类型
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
