package com.experiment.instance.designPattern.adaptive;

/**
 * @author hanwen.dong
 * @date 2019/4/25 15:06
 * @Description 类适配器设计
 *  目的：使用者希望使用的方法源接口没有，目标
 */

public class Adapter extends Adaptee implements Target {
    @Override
    public void cxx1() {
        System.out.println("cxx1");
    }
}
