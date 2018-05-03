package com.example.demo.constant;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class constantProperties {

    //电商ID
    private String EBusinessID="1336182";
    //电商加密私钥，快递鸟提供，注意保管，不要泄漏
    private String AppKey="f0850e52-a2fd-4923-89e4-2a92044a54c2";
    //请求url
    private String ReqURL="http://api.kdniao.cc/Ebusiness/EbusinessOrderHandle.aspx";
}
