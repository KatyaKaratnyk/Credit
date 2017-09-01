package com.butterfly;

import java.util.HashMap;
import java.util.HashSet;

public class CreditList {
    private static HashMap<Credit, Bank> myListCredit = new HashMap<>();

    public static HashMap< Credit, Bank> getMyListCredit() {
        return myListCredit;
    }
}
