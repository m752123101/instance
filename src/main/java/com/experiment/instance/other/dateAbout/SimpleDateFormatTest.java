package com.experiment.instance.other.dateAbout;

import java.text.SimpleDateFormat;

/**
 * @Auther: hanwen.dong
 * @Date: 2019/4/9 15:06
 * @Description: auto
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        testFormatPramter();

    }

    private static void testFormatPramter() {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyMM");
        System.out.println(dateFormat.format(System.currentTimeMillis()));
        //1904
    }
}
