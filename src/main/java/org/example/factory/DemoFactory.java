package org.example.factory;


import java.util.Scanner;

public class DemoFactory {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB =new BankB();

        String cardNumber , bankCode;
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter The Card number");
        cardNumber = scanner.nextLine();
        bankCode = cardNumber.substring(0,6);
        switch (bankCode){
            case "123456":
                System.out.println(bankA.withdrow());
                break;
            case "111111":
                System.out.println(bankB.withdrow());
                break;
        }
    }
}
