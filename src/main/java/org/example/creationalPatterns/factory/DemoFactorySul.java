package org.example.creationalPatterns.factory;

import java.util.Scanner;

public class DemoFactorySul {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB =new BankB();

        String cardNumber , bankCode;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter The Card number");
        cardNumber = scanner.nextLine();
        bankCode = cardNumber.substring(0,6);
        BankFactory bankFactory = new BankFactory();
        IBank bank = bankFactory.getBank(bankCode);
        System.out.println(bank.withdrow());

    }
}
