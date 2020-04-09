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
    }
}
