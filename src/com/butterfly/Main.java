package com.butterfly;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Katya"); //Тут ми створюємо клієнтів
        Client client2 = new Client("Oleh");
        Client client3 = new Client("Valya");
        Client client4 = new Client("Pasha");
        Client client5 = new Client("Vova");
        Client client6 = new Client("Ira");
        CreditService.findOptimal(TypeCredit.CAR, 20000, 12); // Знаходимо оптимальний банк, де процент найменший
        CreditManager.giveCredit(3, 2000, 12, TypeCredit.CASH, new PrivatBank()); // Видаємо кредит
        client1.showAllCredits(); //Клієнт перевіряє свої кредити
        client3.showAllCredits();
        CreditManager.increase(client3, 1, 200); // Збільшуємо розмір кредиту
        client3.showAllCredits();
        client3.payCredit(1, 600); //Сплачуємо кредит
        client3.showAllCredits();
        client3.payCredit(1, 2700); //Якщо вся сума виплачена, після сплати кредит автоматично закривається
        client3.showAllCredits();
    }
}
