package com.butterfly;

import java.util.HashMap;

public class CreditManager {

    public static void giveCredit(int idClient, double sum, int period, TypeCredit typeCredit, Bank myBank) {
        Credit myCredit = new Credit(period, typeCredit);
        if (ClientList.getMyList().containsKey(idClient)) {
            ClientList.getMyList().get(idClient).getMyListCredit().add(myCredit);
            CreditList.getMyListCredit().put(myCredit, myBank);
            myCredit.setPaymentAmount(myBank.createPayment(sum, typeCredit, period));
        }
        else System.out.println("There is no client with such id");
    }
    public static void close(Client myClient, int id) {

    }
    public static void increase(Client myClient, int id, double sum) {
        if(ClientList.getMyList().containsValue(myClient)) {
            Credit credit = myClient.getMyListCredit().get(id-1);
            Bank bank = CreditList.getMyListCredit().get(myClient.getMyListCredit().get(id-1));
            double oldSum = credit.getPaymentAmount();
            credit.setPaymentAmount(bank.createPayment(sum, credit.getTypeCredit(), credit.getPeriodCredit()));
            double newSum = credit.getPaymentAmount()+oldSum;
            credit.setPaymentAmount(newSum);
        }
            else System.out.println("No such client");
    }
    public static void payCreditManager(Client myClient, int id, double sum) {
        if(ClientList.getMyList().containsValue(myClient)) {
            Credit credit = myClient.getMyListCredit().get(id-1);
            double newSum = credit.getPaymentAmount()-sum;
            credit.setPaymentAmount(newSum);
        }
    }
    public static void closeCredit(Client myClient, int id) {
        if(ClientList.getMyList().containsValue(myClient)) {
            Credit credit = myClient.getMyListCredit().get(id-1);
            if(credit.getPaymentAmount()<=0) {
                myClient.getMyListCredit().remove(credit);
                System.out.println("Your credit is close");
            }
        }
    }


}


