package com.experiment.instance;

import java.util.Objects;

/**
 * @Auther: hanwen.dong
 * @Date: 2019/4/8 17:08
 * @Description: auto
 */
public class Bean {
    private String beanName;
    private Integer beanAge;
    private String beanName2;

    public Bean(){};
    public Bean(String beanName, Integer beanAge, String beanName2) {
        this.beanName = beanName;
        this.beanAge = beanAge;
        this.beanName2 = beanName2;
    }
    public Bean(Integer beanAge) {
        this.beanName=beanAge+" name";
        this.beanAge = beanAge;
        this.beanName2=beanAge+"name 2";
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public Integer getBeanAge() {
        return beanAge;
    }

    public void setBeanAge(Integer beanAge) {
        this.beanAge = beanAge;
    }

    public String getBeanName2() {
        return beanName2;
    }

    public void setBeanName2(String beanName2) {
        this.beanName2 = beanName2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return Objects.equals(beanName, bean.beanName) &&
                Objects.equals(beanAge, bean.beanAge) &&
                Objects.equals(beanName2, bean.beanName2);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(beanName, beanAge, beanName2);
//    }
}
