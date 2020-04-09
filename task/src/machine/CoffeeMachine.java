package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        int loop = 1;
        while (loop != 0) {
            System.out.println("Write action (buy, fill, take, remaining, exit):" + "\n");
            String option = scanner.nextLine();
            System.out.println();
            switch (option) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String n = scanner.next().trim();
                    switch (n) {
                        case "1":
                            if (water > 250 && beans > 16) {
                                water = water - 250;
                                beans = beans - 16;
                                cups = cups - 1;
                                money = money + 4;
                                System.out.println("I have enough resources, making you a coffee!" + "\n");
                            } else {
                                System.out.println("Sorry, not enough water!" + "\n");
                            }
                            break;
                        case "2":
                            if (water > 350 && milk > 75 && beans > 20) {
                                water = water - 350;
                                milk = milk - 75;
                                beans = beans - 20;
                                cups = cups - 1;
                                money = money + 7;
                                System.out.println("I have enough resources, making you a coffee!" + "\n");
                                break;
                            } else {
                                System.out.println("Sorry, not enough water!" + "\n");
                            }
                            break;
                        case "3":
                            if (water > 200 && milk > 100 && beans > 12) {
                                water = water - 200;
                                milk = milk - 100;
                                beans = beans - 12;
                                cups = cups - 1;
                                money = money + 6;
                                System.out.println("I have enough resources, making you a coffee!" + "\n");
                            } else {
                                System.out.println("Sorry, not enough water!" + "\n");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int extra_water = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int extra_milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int extra_beans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int extra_cups = scanner.nextInt();
                    System.out.println("The coffee machine has:\n" +
                            (water + extra_water) + " of water\n" +
                            (milk + extra_milk) + " of milk\n" +
                            (beans + extra_beans) + " of coffee beans\n" +
                            (cups + extra_cups) + " of disposable cups\n" +
                            (money) + " of money");
                    break;
                case "take":
                    System.out.println("I gave you $" + (money));
                    System.out.println("The coffee machine has:\n" +
                            (water) + " of water\n" +
                            (milk) + " of milk\n" +
                            (beans) + " of coffee beans\n" +
                            (cups) + " of disposable cups\n" +
                            "0 of money");

            }
        }
    }
}
