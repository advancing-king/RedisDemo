package com.my.advance.service;

import com.my.advance.entity.User;

public interface UserService {
    public void saveUser(final User user);
    
    public User getUser(final long id);
}
