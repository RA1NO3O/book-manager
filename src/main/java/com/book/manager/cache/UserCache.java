package com.book.manager.cache;

import java.util.HashMap;

public class UserCache{

    private static HashMap<String,Object> userMap = new HashMap<>();

    /**
     * 用户登录时 放入缓存
     * @param username  用户名
     * @param password  密码
     */
    public static void login(String username, String password) {
        userMap.put(username,password);
    }

    /**
     * 用户登出时 清除缓存
     * @param username  用户名
     */
    public static void logout(String username) {
        userMap.remove(username);
    }

    /**
     * 获取用户信息
     * @param key 键
     * @return
     */
    public static Object get(String key) {
        return userMap.get(key);
    }

    /**
     * key 是否存在
     * @param key key
     * @return
     */
    public static boolean isExist(String key) {
        return userMap.containsKey(key);
    }
}
