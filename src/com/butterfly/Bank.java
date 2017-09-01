package com.butterfly;

public abstract class Bank {
    private String nameBank;

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    @Override
    public String toString() {
        return this.nameBank;
    }

    abstract public double createPayment(double sum, TypeCredit typeCredit, int period);
}
