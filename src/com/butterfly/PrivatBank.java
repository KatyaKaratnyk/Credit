package com.butterfly;

public class PrivatBank extends Bank {
    PrivatBank() {
        setNameBank("PrivateBank");
    }

    public double createPayment(double sum, TypeCredit typeCredit, int period) {
        double sum1 = 0;
        if (typeCredit == TypeCredit.CAR) {
            sum1 = sum * 1.3;
        }
        if (typeCredit == TypeCredit.CASH) {
            sum1 = sum*1.5;
        }
        if (typeCredit == TypeCredit.IPOTECA) {
            sum1 = sum*1.25;
        }
        return sum1;
    }
}
