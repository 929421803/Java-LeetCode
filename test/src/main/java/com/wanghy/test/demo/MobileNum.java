package com.wanghy.test.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

/**
 * @Author ：WangHY
 * @date ：Created in 18:19 2019/3/25
 * @Description：
 */
public class MobileNum {

    private volatile HttpClient client ;
    public static String defaultEncoding = "utf-8";
    private String url = "https://www.haof.vip/ggoodsweb/query.do?page=1&rows=1000&mobile=666666&pricesort=1";

    public HttpResponse doPost(Map<String, String> queryParams) throws URISyntaxException, ClientProtocolException, IOException {
        HttpPost pm = new HttpPost();
        URIBuilder builder = new URIBuilder(url);
        //填入查询参数
        if (queryParams != null && !queryParams.isEmpty()) {
            builder.setParameters(paramsConverter(queryParams));
        }
        pm.setURI(builder.build());

        return client.execute(pm);
    }
    private List<org.apache.http.NameValuePair> paramsConverter(Map params) {
        List<org.apache.http.NameValuePair> nvps = new LinkedList<NameValuePair>();
        Set<Map.Entry> paramsSet = params.entrySet();
        for (Map.Entry paramEntry : paramsSet) {
            nvps.add(new BasicNameValuePair(paramEntry.getKey().toString(), paramEntry.getValue().toString()));
        }
        return nvps;
    }

    public JSONObject GetHttpEntity() {

        Map map = new HashMap();
        map.put("page",1);
        map.put("rows", 1000);
        map.put("mobile", 66666);
        map.put("pricesort",1);

        HttpResponse response = null;
        try {
            response = doPost(map);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line=null;
        JSONObject resultJsonObject = null;
        StringBuilder entityStringBuilder=new StringBuilder();
        try {
            BufferedReader b = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"),8*1024);
            while ((line=b.readLine())!=null) {
                entityStringBuilder.append(line+"/n");
            }
            //利用从HttpEntity中得到的String生成JsonObject

            JSONObject json = JSONObject.parseObject(entityStringBuilder.toString());
            resultJsonObject =json;
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
//	System.out.println("***httpResponse.getEntity():"+resultJsonObject);

        return resultJsonObject;

    }

    public static void main(String[] args){


        JSONObject json = JSONObject.parseObject(sendRequest( "https://www.haof.vip/ggoodsweb/query.do?page=1&rows=1000&mobile=8888&pricesort=1&areacode=100", "POST"));

        JSONArray array = json.getJSONArray("items");

        for(int i = 0 ; i<array.size();i++){
            JSONObject bean = (JSONObject) array.get(i);
            String areaname = bean.getString("areaname");
            String channelname = bean.getString("channelname");
            String city = bean.getString("city");
            String mobile = bean.getString("mobile");
            String price = bean.getString("price");
            System.out.println(areaname+"---"+channelname+"---"+city+"---"+mobile+"---"+price);
        }
    }

    public static String sendRequest(String urlParam,String requestType) {

        HttpURLConnection con = null;

        BufferedReader buffer = null;
        StringBuffer resultBuffer = null;

        try {
            URL url = new URL(urlParam);
            //得到连接对象
            con = (HttpURLConnection) url.openConnection();
            //设置请求类型
            con.setRequestMethod(requestType);
            //设置请求需要返回的数据类型和字符集类型
            con.setRequestProperty("Content-Type", "text/html;charset=UTF-8");
            //允许写出
            con.setDoOutput(true);
            //允许读入
            con.setDoInput(true);
            //不使用缓存
            con.setUseCaches(false);
            //得到响应码
            int responseCode = con.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK){
                //得到响应流
                InputStream inputStream = con.getInputStream();
                //将响应流转换成字符串
                resultBuffer = new StringBuffer();
                String line;
                buffer = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                while ((line = buffer.readLine()) != null) {
                    resultBuffer.append(line);
                }
                return resultBuffer.toString();
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
        return "";
    }


}
