package com.wanghy.test.controller;

import java.io.IOException;
import java.util.Scanner;

/**
 * @ Author     ：WangHY
 * @ Date       ：Created in 19:07 2018/12/19
 * @ Description：
 */
public class StringUtil {



    public static void main(String args[]) throws IOException {

        regex();
    }

    public static void regex() throws IOException {
        Scanner input=new Scanner(System.in);
        String regex = "^(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[a-z].*).{6,20}$";
        while (true){
            String str = input.next();

            if(str.matches(regex)){
                System.out.println("T");
            }else {
                System.out.println("F");
            }
        }
    }

    /**
     * 倒序输出
     * @param
     */
    public static void out(){
        String str = "fhkhbyfbihbffcljvtddifdeeshyvinjkvyfdhjbinmogdscuddchgvggffddjhcvhvtfvvjjhyjnpn" , result = "";
        char[] chars =str.toCharArray();
        for (int i = chars.length-1 ; i >= 0; i--) {
            result = result + chars[i];
        }
        System.out.println(result);

    }
}
