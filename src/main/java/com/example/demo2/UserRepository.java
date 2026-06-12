package com.example.demo2;

import java.util.ArrayList;

public class UserRepository {
    // save arraylist
    private static ArrayList<User> daftarUser = new ArrayList<>();

    // add user baru ke array list
    public static void addUser(String username, String password) {
        User userBaru = new User(username, password);
        daftarUser.add(userBaru);
    }

    // cek data login
    public static boolean checkLogin(String username, String password) {
        for (User u : daftarUser) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
