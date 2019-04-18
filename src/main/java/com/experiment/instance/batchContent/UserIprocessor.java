package com.experiment.instance.batchContent;

import com.experiment.instance.domain.User;
import org.springframework.batch.item.ItemProcessor;

import java.util.Date;

/**
 * @author hanwen.dong
 * @date 2019/4/18 17:34
 * @Description auto
 */

public class UserIprocessor implements ItemProcessor<User, User> {
    @Override
    public User process(User user) throws Exception {
        final String userId = "2014010" + user.getUserId();
        final String gender = user.getGender().equals("M") ? "male" : "female";
        final Date birth = user.getBirth();
        final String userName = user.getUserName().substring(0, 1).toUpperCase() + user.getUserName().substring(1).toLowerCase();
        final String address = user.getAddress().substring(0, 1).toUpperCase() + user.getAddress().substring(1).toLowerCase();

        final User transformedUser = new User(userId, userName, address, birth, gender);
        return transformedUser;
    }
}
