package com.wanghy.test.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：WangHY
 * @ Date       ：Created in 15:20 2018/11/8
 * @ Description：
 */
public class test {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 1);
		map.put(11, 1);
		map.put(12, 1);
		for (Object o : map.keySet()) {
			System.out.println(o);
		}

	}
}
