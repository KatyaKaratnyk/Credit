package com.butterfly;

import java.util.HashMap;

public class Credit {
    private static int id=1;
    private int idCredit;
    private double paymentAmount;
    private int periodCredit;
    private TypeCredit typeCredit;

    Credit(int periodCredit, TypeCredit typeCredit) {
        this.idCredit = Credit.id++;
        this.periodCredit = periodCredit;
        this.typeCredit = typeCredit;
    }

    public int getIdCredit() {
        return idCredit;
    }

    @Override
    public String toString() {
        return "Number your credit is: "+this.getIdCredit()+" and sum by payment is: " + this.getPaymentAmount();
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public TypeCredit getTypeCredit() {
        return typeCredit;
    }

    public int getPeriodCredit() {
        return periodCredit;
    }
}
