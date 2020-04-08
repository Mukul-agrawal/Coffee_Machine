package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int beans = 15;
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
    }
}
