package com.wanghy.test.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：WangHY
 * @Date ：Created in 13:55 2019/2/12
 * @Description：
 */
public class KuaiPai {


    public static int[] quickSort(int left, int right, int[] arr) {

        if (left > right) return arr;
        int i = left;
        int j = right;
        int flag = arr[i];

        while (i < j) {
            while (j > i && arr[j] > flag) {
                j--;
            }
            if (j > i) arr[i] = arr[j];
            while (j > i && arr[i] < flag) {
                i++;
            }
            if (i < j) arr[j] = arr[i];
        }
        arr[i] = flag;
        quickSort(left, i - 1, arr);
        quickSort(i + 1, right, arr);
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 8, 6, 47, 5, 73};

        System.out.println(Arrays.toString(quickSort(0, arr.length - 1, arr)));


    }


}
