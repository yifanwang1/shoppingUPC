package com.upc.service.user;


import com.upc.model.User;

import java.util.List;

/**
 * Created by wyf on 2018/9/4.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
