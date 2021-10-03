package BASIC.Additional_Problems_MIX.ConditionalsAdv;

import java.util.Scanner;

public class Vacation2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();     //"Summer" или "Winter"
        String location = "";                   //"Alaska" и "Morocco".
        String type = "";                       //"Hotel", "Hut" или "Camp".

        if (budget <= 1000) {
            type = "Camp";
            if (season.equals("Summer")) {
                budget = budget * 0.65;
                location = "Alaska";
            } else if (season.equals("Winter")) {
                budget = budget * 0.45;
                location = "Morocco";
            }

        } else if (budget <= 3000) {
            type = "Hut";
            if (season.equals("Summer")) {
                budget = budget * 0.80;
                location = "Alaska";
            } else if (season.equals("Winter")) {
                budget = budget * 0.60;
                location = "Morocco";
            }

        } else {
            type = "Hotel";
            if (season.equals("Summer")) {
                budget = budget * 0.90;
                location = "Alaska";
            } else if (season.equals("Winter")) {
                budget = budget * 0.90;
                location = "Morocco";
            }

        }
        System.out.printf("%s - %s - %.2f", location,type,budget);
    }
}
