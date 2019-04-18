package com.experiment.instance.arithmetic;

import com.sun.deploy.util.ArrayUtil;

/**
 * @author hanwen.dong
 * @date 2019/4/17 19:53
 * @Description auto
 */

public class test {
    public static void main(String[] args) {
        //给数组去重
        int[] cx = new int[]{3, 4, 5, 6, 6, 2, 1, 3};
        int[] target = new int[cx.length];
        for (int i = 0; i < cx.length; i++) {
            Boolean flag=false;
            int value=0;
            int temp;
            for(int j=0;j<cx.length;j++){
                if(cx[i]==target[j]){
                    flag=true;
                    break;
                }
            }
        }
    }

    private static void 冒泡排序() {
        //给数组进行排序
        int[] cx = new int[]{3, 9, 5, 4, 1, 7};
        for (int i = 0; i < cx.length; i++) {
            for (int j = i + 1; j < cx.length; j++) {
                int temp;
                if (cx[i] < cx[j]) {
                    temp = cx[i];
                    cx[i] = cx[j];
                    cx[j] = temp;
                }
            }
        }
        for (int i = 0; i < cx.length; i++) {
            System.out.print(cx[i] + ",");
        }
    }
}
