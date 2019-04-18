package com.experiment.instance.domain;

import java.util.Date;
import java.util.Objects;

/**
 * @author hanwen.dong
 * @date 2019/4/18 16:56
 * @Description auto
 */

public class User {
    private String userId;
      private String userName;
      private String address;
      private Date birth;
     private String gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(address, user.address) &&
                Objects.equals(birth, user.birth) &&
                Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, address, birth, gender);
    }

    public User(String userId, String userName, String address, Date birth, String gender) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.birth = birth;
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
