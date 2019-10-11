package com.wanghy.test.demo;

/**
 * @Author ：WangHY
 * @date ：Created in 16:45 2019/5/13
 * @Description：字符串匹配，如果不匹配，取当前子串后一个位置的主串与子串作比较，如果字串中不存在对应字符，子串头部移到比较的字符后面一个位置；
 * 如果存在，移到相匹配的位置。
 */
public class Sunday {

    public static int contains(char[] chars, char c) {
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public static void sunday(String main, String son) {
        char[] m = main.toCharArray();
        char[] s = son.toCharArray();

        int ml = m.length;
        int sl = s.length;
        int i = 0, j = 0;

        while (i <= ml - sl + j) {
            if (m[i] != s[j]) {
                if (i == ml - sl + j) {
                    break;
                }
                int t = contains(s, m[i + sl - j]);
                if (t == -1) {
                    i = i + sl - j + 1;
                    j = 0;
                } else {
                    i = i + sl - j - t;
                    j = 0;

                }
            } else {
                if (j == sl - 1) {
                    i = i - j + 1;
                    j = 0;
                    System.out.println((i-1)+"---"+(i+sl-2));
                }
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        String a = "12345678123456123";
        String b = "123";
        sunday(a,b);
    }


}
