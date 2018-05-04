package com.example.demo;

import com.example.demo.service.logisticsService;
import org.springframework.boot.SpringApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * 快递鸟物流轨迹即时查询接口
 *
 */
public class LogisticsApplication {

	//DEMO
	public static void main(String[] args) {
		SpringApplication.run(LogisticsApplication.class,args);
	}
}