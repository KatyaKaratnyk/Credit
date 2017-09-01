package com.butterfly;

public class CredoBank extends Bank {
    CredoBank() {
        setNameBank("CredoBank");
    }
    public double createPayment(double sum, TypeCredit typeCredit, int period) {
        double sum1 = 0;
        if (typeCredit == TypeCredit.CAR) {
            sum1 = sum * 1.15;
        }
        if (typeCredit == TypeCredit.CASH) {
            sum1 = sum*1.55;
        }
        if (typeCredit == TypeCredit.IPOTECA) {
            sum1 = sum*1.37;
        }
        return sum1;
    }
}
