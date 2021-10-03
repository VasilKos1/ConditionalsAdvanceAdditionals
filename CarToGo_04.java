package BASIC.Additional_Problems_MIX.ConditionalsAdv;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();   //"Summer" или "Winter"

        String classType = "";
        String carType = "";

        if (budget <= 100) {
            classType = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                budget = budget * 0.35;

            } else if (season.equals("Winter")) {
                carType = "Jeep";
                budget = budget * 0.65;
            }
        } else if (budget <= 500) {
            classType = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                budget = budget * 0.45;

            } else if (season.equals("Winter")) {
                carType = "Jeep";
                budget = budget * 0.80;
            }
        } else {
            classType = "Luxury class";
            carType = "Jeep";
            budget = budget * 0.90;
        }
        System.out.println(classType);

        System.out.printf("%s - %.2f", carType, budget);
    }
}
