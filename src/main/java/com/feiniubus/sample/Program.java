package com.feiniubus.sample;

import com.feiniubus.security.crypto.SignatureUtil;
import com.feiniubus.security.model.Payload;

public class Program {
    private final static String APPID="55d584fads9e4d71b04jhf8ea613013c3";
    private final static String APPSECRET = "+3QH4hm0DzKN3JaYeQO0Zc0F6GWnbAfdqk7Wrg==";
    private final static String CONTENT = "content";
    private final static Integer TIMESTAMP = 1532589031;

    public static void main(String[] args){
        Payload payload = new Payload();
        payload.setAppId(APPID, "utf-8");
        payload.setContent(CONTENT, "utf-8");
        payload.setTimestamp(TIMESTAMP);

        String signature = SignatureUtil.sign(payload, APPSECRET.getBytes());

        System.out.println(signature);
    }
}
