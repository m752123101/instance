package com.experiment.instance.java8;

import com.experiment.instance.Bean;
import org.springframework.util.StringUtils;

import java.util.ArrayList;

/**
 * @author hanwen.dong
 * @date 2019/4/15 15:19
 * @Description auto
 */

public class test1 {
    public static void main(String[] args) {
        String d="01234567890123456789012";
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
        System.out.println(d.substring(8,16));
        System.out.println(d.substring(16,23));


    }
}
