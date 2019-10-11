package com.wanghy.test.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：WangHY
 * @ Date       ：Created in 15:20 2018/11/8
 * @ Description：
 */
public class test {
    public static void main(String[] args){
        Map map = new HashMap(1);
        map.put("test" , null);
        System.out.println(map.get("test"));
        System.out.println(map.get("test1"));
        System.out.println(1<<2);
        System.out.println(8>>2);
        long sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
