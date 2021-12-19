//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.entity.UserExample;
import com.example.service.UserService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public String register(User userRegister) {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userRegister.getUsername());
        List<User> userSelects = this.userDao.selectByExample(userExample);
        if (userSelects.isEmpty()) {
            String newPassword = (new SimpleHash("MD5", userRegister.getPassword(), Util.bytes(userRegister.getUsername()))).toHex();
            userRegister.setPassword(newPassword);
            this.userDao.insert(userRegister);
            jsonObject.put("result", true);
            jsonObject.put("message", "注册成功");
        } else {
            jsonObject.put("result", false);
            jsonObject.put("message", "用户名已存在");
        }

        return jsonObject.toString();
    }

    public String login(User userLogin, HttpSession httpSession) {
        JSONObject jsonObject = new JSONObject();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userLogin.getUsername());
        List<User> usersSelect = this.userDao.selectByExample(userExample);
        if (usersSelect.isEmpty()) {
            jsonObject.put("result", false);
            jsonObject.put("message", "没有这个用户名");
            return jsonObject.toString();
        } else {
            User userSelect = (User)usersSelect.get(0);
            String loginPassword = (new SimpleHash("MD5", userLogin.getPassword(), Util.bytes(userLogin.getUsername()))).toHex();
            if (loginPassword.equals(userSelect.getPassword())) {
                httpSession.setAttribute("userId", userSelect.getUserId());
                httpSession.setAttribute("username", userLogin.getUsername());
                httpSession.setAttribute("password", loginPassword);
                jsonObject.put("result", true);
                jsonObject.put("message", "登录成功");
                return jsonObject.toString();
            } else {
                jsonObject.put("result", false);
                jsonObject.put("message", "密码错误");
                return jsonObject.toString();
            }
        }
    }

    public String getUserLogin(HttpSession httpSession) {
        JSONObject jsonObject = new JSONObject();
        if (httpSession.getAttribute("userId") == null) {
            jsonObject.put("result", false);
            jsonObject.put("message", "未登录");
            return jsonObject.toString();
        } else {
            jsonObject.put("result", true);
            jsonObject.put("message", "");
            JSONObject user = new JSONObject();
            user.put("userId", httpSession.getAttribute("userId"));
            user.put("username", httpSession.getAttribute("username"));
            jsonObject.put("user", user);
            return jsonObject.toString();
        }
    }

    public String logout(HttpSession httpSession) {
        JSONObject jsonObject = new JSONObject();
        if (httpSession.getAttribute("userId") == null) {
            jsonObject.put("result", true);
            jsonObject.put("message", "未登录");
            return jsonObject.toJSONString();
        } else {
            httpSession.removeAttribute("userId");
            httpSession.removeAttribute("username");
            jsonObject.put("result", true);
            jsonObject.put("message", "已登出");
            return jsonObject.toJSONString();
        }
    }
}
