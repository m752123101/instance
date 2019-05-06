package com.experiment.instance.designPattern.factoryDesign.staticM;

/**
 * @author hanwen.dong
 * @date 2019/4/24 17:13
 * @Description 静态工厂模式
 */

public class Client {
    public static void main(String[] args) {
        /**
         * 运用： 多态
         * 解释：多个子类实现同一接口，
         * 通过静态工厂模式设置标识获取对应的实现类。
         */
        Food f=null;
        f = StaticFactory.getA();
        f = StaticFactory.getB();
        f = StaticFactory.getC();
    }
}
