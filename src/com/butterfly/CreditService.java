package com.butterfly;

import java.util.ArrayList;

public class CreditService {
    public static void findOptimal(TypeCredit type, double sum, int period) {
        ArrayList<Bank> myList = new ArrayList<>();
        myList.add(new PrivatBank());
        myList.add(new OksiBank());
        myList.add(new CredoBank());
        String name = myList.get(0).toString();
        double sum1 = myList.get(0).createPayment(sum,type,period);
        for(Bank e: myList) {
            if(e.createPayment(sum, type, period)<sum1){
                sum1 = e.createPayment(sum, type, period);
                name = e.getNameBank();
            }
        }
        System.out.println(name);
    }
}
