package com.wanghy.test.demo;

class NoPublic {
	public static void main(String[] args) {
		
		System.out.print(-55 % 4);
//		System.out.print("我是一个没有public的类");
//		System.out.print(new Date(-100));
//		System.out.print(new Date(0));
//		System.out.print(maximum69Number(9966));
//		System.out.print("1234".substring(2));
	}
	
	public static int maximum69Number(int num) {
		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '6') {
				sb.append("9");
				if (i + 1 < str.length()) {
					sb.append(str.substring(i + 1));
				}
				break;
			}
			sb.append("9");
		}
		return Integer.parseInt(sb.toString());
	}
	
}
