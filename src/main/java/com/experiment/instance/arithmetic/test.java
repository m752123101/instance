package com.experiment.instance.arithmetic;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * @author hanwen.dong
 * @date 2019/4/17 19:53
 * @Description auto
 */

public class test {
    public static void main(String[] args) {

//        Integer[] cx = new Integer[]{3, 4, 5, 6, 6, 2, 1, 3};
//        Set set=new HashSet();
//        数组去重(cx);
//        System.out.println("=================");
//        利用set特性去重(cx, set);
//        System.out.println("=================");
//     //   古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
//        冒泡排序(cx);
//        System.out.println("=================");
//        //判断101-200之间有多少个素数，并输出所有素数。
//        //素数-》质数-==除1和其本身以外不能被整除的数。
//        //1，其本身，偶数
//        int head=50;
//        for(int i=101;i<201;i++){
//            if(iszhishu(i)){
//                System.out.println("adsad");
//            }
//        }

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.set(0,"00");
          final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
        System.out.println(DEFAULTCAPACITY_EMPTY_ELEMENTDATA.length);
        int max = Math.max(10, 11);
        int x=9;
        x=x>>1;
        System.out.println(x);
        System.out.println("==================");

    }

    public static boolean iszhishu(int x){
        for(int i=2;i<x/2;x++){
          if(2%x==0){
              return true;
          }  else{
              return false;
          }
        }
        return false;
    }

    private static void 利用set特性去重(Integer[] cx, Set set) {
        Arrays.stream(cx).forEach((t)->
                set.add(t));
        System.out.println();
    }

    private static void 数组去重(Integer[] cx) {
        int[] temp = new int[cx.length];
        int targetSize=0;
        for (int i = 0; i < cx.length; i++) {

            boolean flag=true;
            for(int j=i+1;j<cx.length;j++){
                if(cx[j].equals(cx[i])){
                    flag=false;
                    break;
                }
            }
            if(flag){
                temp[targetSize]=cx[i];
                targetSize++;
            }

        }
        int [] target=new int[targetSize];
        System.arraycopy(temp,0,target,0,targetSize);
    }


    private static void 冒泡排序(Integer [] cx) {
        //给数组进行排序
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
