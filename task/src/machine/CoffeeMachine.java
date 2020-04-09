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
        switch (option) {
            case "buy":
                System.out.println("\"What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int n = scanner.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("The coffee machine has:\\n" +
                                (water - 250) + " of water\n" +
                                (milk) + " of milk\n" +
                                (beans - 16) + " of coffee beans\n" +
                                (cups - 1) + " of disposable cups\n" +
                                (money + 4) + " of money");
                        break;
                    case 2:
                        System.out.println("The coffee machine has:\n" +
                                (water - 350) + " of water\n" +
                                (milk - 75) + " of milk\n" +
                                (beans - 20) + " of coffee beans\n" +
                                (cups - 1) + " of disposable cups\n" +
                                (money + 7) + " of money");
                        break;
                    case 3:
                        System.out.println("The coffee machine has:\n" +
                                (water - 200) + " of water\n" +
                                (milk - 100) + " of milk\n" +
                                (beans - 12) + " of coffee beans\n" +
                                (cups - 1) + " of disposable cups\n" +
                                (money + 6) + " of money");
                        break;
                }
                break;
            case "fill":
                System.out.println("\"Write how many ml of water do you want to add:");
                int extra_water = scanner.nextInt();

        }
    }
}
