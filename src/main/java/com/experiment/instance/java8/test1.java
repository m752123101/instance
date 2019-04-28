package com.experiment.instance.java8;

import com.experiment.instance.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hanwen.dong
 * @date 2019/4/15 15:19
 * @Description auto
 */

public class test1 {

    public static void main(String[] args) {
        List<Bean> list;
        {
            list = new ArrayList<>();
            for (int i = 0; i < 120; i++) {
                Bean c = new Bean(i);
                list.add(c);
            }
        }
        //限制遍历(list);
//        keyValue转换(list);
//        跳过转换(list);
//        去重转换(list);
        限制过滤转换(list);
//        排序分页转换(list);
    }

    private static void 限制遍历(List<Bean> list) {
        list.stream().limit(20).forEach(System.out::println);
    }

    private static void keyValue转换(List<Bean> list) {
        List<Integer> collect = list.stream().map(Bean::getBeanAge).filter(bean -> !bean.equals(2)).limit(10).collect(Collectors.toList());
        System.out.println("======================");
    }

    private static void 跳过转换(List<Bean> list) {
        List<Bean> collect = list.stream().skip(30).collect(Collectors.toList());
        System.out.println("==============================");
    }

    //无效
    private static void 去重转换(List<Bean> list) {
        list.add(new Bean(1));
        List<Bean> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println("=========================");
    }

    private static void 限制过滤转换(List<Bean> list) {
        List<Bean> collect = list.stream().limit(20).filter(bean -> bean.getBeanAge() >= 2).collect(Collectors.toList());
        System.out.println("==================");
    }

    private static void cvv() {
        String d = "01234567890123456789012";
        //CVV算法：
        //SUM1 = 16位卡号+4位有效期+3位服务码（三个字符串按序拼接）
        //S1 = SUM1(1:8)
        //S2 = SUM1(9:8)
        //S3 = SUM1(17:7)
        //CVV_D1 = S1 % 10
        //CVV_D2 = S2 % 10
        //CVV_D3 = S3 % 10
        //CVV = CVV_D1 + CVV_D2 + CVV_D3 (三个字符串按序拼接)
        char[] chars = d.toCharArray();
        System.out.println(d.substring(0, 8));
        System.out.println(d.substring(8, 16));
        System.out.println(d.substring(16, 23));
    }

    private static void 排序分页转换(List<Bean> list) {
        List<Integer> collect = list.stream().map(Bean::getBeanAge).sorted().limit(5).collect(Collectors.toList());
        System.out.println("========================================");
    }
}
