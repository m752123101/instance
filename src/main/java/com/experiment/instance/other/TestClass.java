package com.experiment.instance.other;

import com.experiment.instance.Bean;

/**
 * @Auther: hanwen.dong
 * @Date: 2019/4/12 10:23
 * @Description: auto
 */
public class TestClass {
    public static void main(String[] args) throws Exception {
        Bean bean=new Bean();
        Class<?> bean1 = Class.forName("Bean");
        if(bean1.isInstance(Bean.class)){
            System.out.println("yes");
        }
    }
}
