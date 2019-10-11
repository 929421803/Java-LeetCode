package com.wanghy.test.demo;/**
 * @Author ：WangHY
 * @date ：Created in 17:20 2019/2/11
 * @Description：
 */

/**
 * @author ：WangHY
 * @ Date       ：Created in 17:20 2019/2/11
 * @ Description：
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 */
public class ZhengShuFanZhuan {
    public static void main(String[] args) {

        System.out.println(solution(-123));
        System.out.println(solution(123));
        System.out.println(solution(0));
        System.out.println(best(-123));
        System.out.println(best(123));
        System.out.println(best(0));
        System.out.println(Integer.parseInt("99999999999999999999999999"));

    }

    public static int solution(int num) {

        if (num == 0) return 0;
        int result = 0;
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        if (num < 0) {
            flag = true;
            num = -num;
        }
        while (num != 0) {
            int mo = num % 10;
            num /= 10;
            str.append(mo);
        }
        try {
            result = Integer.parseInt(str.toString());
        } catch (Exception e) {
            System.out.println("---" + str);
        }
        result = flag ? result : -result;

        return result;

    }

    static int best(int num) {
        int result = 0;
        while (num != 0) {
            int mo = num % 10;
            num /= 10;
            result = result * 10 + mo;
        }
        return result;
    }
}
