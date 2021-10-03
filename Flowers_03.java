package BASIC.Additional_Problems_MIX.ConditionalsAdv;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());   //броят на закупените хризантеми
        int r = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();                //Spring, Summer, Аutumn, Winter
        String workYesNo = scanner.nextLine();             //Y – да / N - не
        double total = 0;
        int flowersTotal = h + r + l;

        switch (season) {
            case "Spring":
            case "Summer":
                total = h * 2.00 + r * 4.10 + l * 2.50;
                if (workYesNo.equals("Y")) {
                    total = total * 1.15;           // total*=1.15

                }
                if (l >= 7 && season.equals("Spring")) {
                    total = total * 0.95;
                }
                if (flowersTotal >= 20) {
                    total = total * 0.80;
                }
                break;
            case "Autumn":
            case "Winter":
                total = h * 3.75 + r * 4.50 + l * 4.15;
                if (workYesNo.equals("Y")) {
                    total = total * 1.15;
                }
                if (r >= 7 && season.equals("Winter")) {
                    total = total * 0.90;
                }
                if (flowersTotal >= 20) {
                    total = total * 0.80;
                }

                break;
        }
        total = total + 2;
        System.out.printf("%.2f", total);
    }
}
