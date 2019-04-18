package com.experiment.instance.java8;

import org.springframework.util.StopWatch;

/**
 * @author hanwen.dong
 * @date 2019/4/18 10:18
 * @Description auto
 */

public class test2 {
    public static void main(String[] args) {
        秒表();
    }

    private static void 秒表() {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start("start 1");
        stopWatch.stop();
        System.out.println("调用耗时："+stopWatch.prettyPrint());
    }
}
