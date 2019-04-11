package com.test.fortest.testString;

import com.test.fortest.Bean;
import org.springframework.util.StringUtils;

/**
 * @Auther: hanwen.dong
 * @Date: 2019/4/8 15:49
 * @Description: auto
 */
public class TestString {
    public static void main(String[] args) {
        Bean bean=new Bean();
        bean.setBeanName2("1");
        bean.setBeanName("1");
        bean.setBeanage(1);
        //只要一个为空就进入判断
        Boolean cx= bean==null||StringUtils.isEmpty(bean.getBeanName())||StringUtils.isEmpty(bean.getBeanName2());

        if(cx){
            System.out.println("有空参数");
        }
    }
}
