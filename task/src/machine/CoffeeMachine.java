package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The coffee machine has:");
        int water = scanner.nextInt();
        System.out.println(water + " of water");
        int milk = scanner.nextInt();
        System.out.println(milk + " of milk");
        int beans = scanner.nextInt();
        System.out.println(beans + " of coffee beans");
        int cups = scanner.nextInt();
        System.out.println(cups + " of disposable cups");
        int money = scanner.nextInt();
        System.out.println(money + " of money");
        System.out.println("Write action (buy, fill, take):");
        scanner.nextLine();
        String option = scanner.nextLine();
    }
}
