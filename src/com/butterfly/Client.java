package com.butterfly;

import java.util.ArrayList;

public class Client {
    private static int id=1;
    private int idClient;
    private String nameClient;
    private ArrayList<Credit> myListCredit = new ArrayList<>();

    Client (String name) {
        this.nameClient = name;
        this.idClient = Client.id++;
        ClientList.getMyList().put(idClient, this);
    }
    public void showAllCredits() {
        if (this.getMyListCredit().isEmpty()) System.out.println("You have any credit");
        for (Credit e : this.getMyListCredit()) System.out.println(e.toString());
    }
    public void payCredit(int id, double sumPayment) {
        CreditManager.payCreditManager(this, id, sumPayment);
        System.out.println("You paid: "+sumPayment);
        CreditManager.closeCredit(this,id);
    }

    public ArrayList<Credit> getMyListCredit() {
        return myListCredit;
    }

    public static int getId() {
        return id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public int getIdClient() {
        return idClient;
    }

    @Override
    public String toString() {
        return this.getNameClient();
    }
}
