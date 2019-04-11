package com.experiment.instance.MD5;

import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

/**
 * @Auther: hanwen.dong
 * @Date: 2019/4/8 15:33
 * @Description: auto
 */
public class md5 {
    public static void main(String[] args) {

    }
//spring md5方法使用
    private static void springMD5() {
        String x = "11111111";
        String s = DigestUtils.md5DigestAsHex(x.getBytes());
        System.out.println(s
        );
        Integer xx = 0;
        String substring = s.substring(0, 8);
        for (byte aByte : substring.getBytes()) {
            xx++;
        }

        System.out.println(xx);
    }
}
