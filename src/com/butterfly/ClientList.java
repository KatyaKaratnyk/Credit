package com.butterfly;

import java.util.HashMap;

public class ClientList {
    private static HashMap<Integer, Client> myList = new HashMap<>();

    public static HashMap<Integer, Client> getMyList() {
        return myList;
    }
}
