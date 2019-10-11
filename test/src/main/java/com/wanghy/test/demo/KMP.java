package com.wanghy.test.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：WangHY
 * @ Date       ：Created in 16:04 2018/10/25
 * @ Description：
 */
public class KMP {

    public static boolean hasSubString(String originStr, String subString) {
        if ((null != originStr && null != subString) && (originStr.length() < subString.length())) {
            return false;
        }
        char[] originStrChars = originStr.toCharArray();
        char[] subStringChars = subString.toCharArray();
        return matchString(originStrChars, subStringChars);
    }

    /**
     * KMP中的核心算法，获得记录跳转状态的next数组
     *
     * @param c
     * @return
     */
    public static int[] matchTable(char[] c) {
        int length = c.length;
        int[] a = new int[length];
        int i, j;
        a[0] = -1;
        i = 0;
        for (j = 1; j < length; j++) {
            i = a[j - 1];
            while (i >= 0 && c[j] != c[i + 1]) {
                i = a[i];
            }
            if (c[j] == c[i + 1]) {
                a[j] = i + 1;
            } else {
                a[j] = -1;
            }
        }
//        String[] atp = {"Rafael Nadal", "Novak Djokovic",
//                "Stanislas Wawrinka",
//                "David Ferrer","Roger Federer",
//                "Andy Murray","Tomas Berdych",
//                "Juan Martin Del Potro"};
//        List<String> players =  Arrays.asList(atp);
//        players.forEach(System.out::println);
        return a;
    }

    /**
     * 匹配字符串
     *
     * @param originStrChars
     * @param subStringChars
     * @return
     */
    public static boolean matchString(char[] originStrChars, char[] subStringChars) {
        int[] next = getNext(subStringChars);
        int i = 0;
        int j = 0;
        while (i <= originStrChars.length - 1 && j <= subStringChars.length - 1) {
            if (j == -1 || originStrChars[i] == subStringChars[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j < subStringChars.length) {
            return false;
        } else {
            return true;
        }
    }
    public static int[] getNext(char[] p){
//        char[] p = subStr.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1 ){
            if(k == -1 || p[j] == p[k]){
                next[++j] = ++k;

            }else {
                k = next[k];
            }
        }
        return  next;
    }
    public static void main(String[] args){
            System.out.println(KMP.hasSubString("absabsabsabcabs", "abcab"));

    }
}
