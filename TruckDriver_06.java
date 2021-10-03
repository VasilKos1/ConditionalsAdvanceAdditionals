package BASIC.Additional_Problems_MIX.ConditionalsAdv;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();  // Spring", "Summer", "Autumn" или "Winter"
        double kilometers = Double.parseDouble(scanner.nextLine());
        double sumPaidKm = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometers <= 5000) {
                    sumPaidKm = 0.75;
                } else if (kilometers <= 10000) {
                    sumPaidKm = 0.95;
                } else if (kilometers <= 20000) {
                    sumPaidKm = 1.45;
                }
                break;
            case "Summer":
                if (kilometers <= 5000) {
                    sumPaidKm = 0.90;
                } else if (kilometers <= 10000) {
                    sumPaidKm = 1.10;
                } else if (kilometers <= 20000) {
                    sumPaidKm = 1.45;
                }
                break;
            case "Winter":
                if (kilometers <= 5000) {
                    sumPaidKm = 1.05;
                } else if (kilometers <= 10000) {
                    sumPaidKm = 1.25;
                } else if (kilometers <= 20000) {
                    sumPaidKm = 1.45;
                }
                break;

        }
        double totalBeforeTax = sumPaidKm*kilometers*4;
        double totalAfterTax =totalBeforeTax*0.90;
        System.out.printf("%.2f",totalAfterTax);
    }
}
