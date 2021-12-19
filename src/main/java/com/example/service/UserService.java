package com.example.service;

import com.example.entity.User;
import javax.servlet.http.HttpSession;

public interface UserService {
    String register(User user);

    String login(User user, HttpSession httpSession);

    String logout(HttpSession httpSession);

    String getUserLogin(HttpSession httpSession);
}
