package com.experiment.designPattern.factoryDesign.staticM;

/**
 * @author hanwen.dong
 * @date 2019/4/24 17:11
 * @Description auto
 */

public class StaticFactory {
    private StaticFactory(){};
    public static A getA(){
        return new A();
    }
    public static B getB(){
        return new B();
    }
    public static C getC(){
        return new C();
    }
}
