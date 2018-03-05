package com.james.utils;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * User: 57140
 * Date: 2018/3/4
 * Time: 14:58
 * Version:V1.0
 */
public class SMSUtil {
    public static String sendSMS(String mobile,String code) {
        String result = null;
        String host = "http://www.api51.cn";
        String path = "/api/smsApi/send";
        String method = "POST";
        Map<String, String> headers = new HashMap<String, String>();

        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("mobile", mobile);
        bodys.put("params", code);
        bodys.put("sign", "网极科技");
        bodys.put("token", "5025164ba1da4b1b8d067f99be9329c7");
        bodys.put("tpl_id", "76966");
        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            result = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
