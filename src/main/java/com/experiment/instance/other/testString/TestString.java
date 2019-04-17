package com.experiment.instance.other.testString;

import com.experiment.instance.Bean;
import org.springframework.util.StringUtils;

/**
 * @Auther: hanwen.dong
 * @Date: 2019/4/8 15:49
 * @Description: auto
 */
public class TestString {
    public static void main(String[] args) {
        System.out.println("ai ni");
    }

    private static void 空指针测试() {
        Bean bean=new Bean();
        bean.setBeanName2("1");
        bean.setBeanName("1");
        bean.setBeanAge(1);
        //只要一个为空就进入判断
        Boolean cx= bean==null|| StringUtils.isEmpty(bean.getBeanName())||StringUtils.isEmpty(bean.getBeanName2());

        if(cx){
            System.out.println("有空参数");
        }
    }
}
