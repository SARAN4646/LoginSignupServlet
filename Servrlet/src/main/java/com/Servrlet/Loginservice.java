package com.Servrlet;

import java.util.HashMap;

public class Loginservice {
    static HashMap<String, String> Users = new HashMap<>();

    void createUser(String name, String pass) {
        Users.put(name, pass);
    }

    String getUsers(String name) {
        return Users.get(name);
    }
}
