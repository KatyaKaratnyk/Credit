package com.butterfly;

public class OksiBank extends Bank {

    OksiBank() {
        setNameBank("OksiBank");
    }

    public double createPayment(double sum, TypeCredit typeCredit, int period) {
        double sum1 = 0;
        if (typeCredit == TypeCredit.CAR) {
            sum1 = sum * 1.29;
        }
        if (typeCredit == TypeCredit.CASH) {
            sum1 = sum*1.45;
        }
        if (typeCredit == TypeCredit.IPOTECA) {
            sum1 = sum*1.3;
        }
        return sum1;
    }

}
