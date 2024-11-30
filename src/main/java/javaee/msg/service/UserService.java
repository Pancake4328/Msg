package javaee.msg.service;

import javaee.msg.entity.User;

public interface UserService {
    User login(String name, String password);
}
