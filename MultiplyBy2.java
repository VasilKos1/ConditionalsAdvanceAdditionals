package BASIC.Additional_Problems_MIX.ConditionalsAdv;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {

            double x = Double.parseDouble(scanner.nextLine());
            if (x < 0) {
                System.out.println("Negative number!");
                break;
            } else {
                System.out.printf("Result: %.2f%n", x * 2);
            }
        }
    }
}
