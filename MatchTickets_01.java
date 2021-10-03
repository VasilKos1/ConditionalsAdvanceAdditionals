package BASIC.Additional_Problems_MIX.ConditionalsAdv;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        //double moneyTransport = 0;


        double ticket = 0;
        switch (category) {
            case "VIP":
                ticket = 499.99;
                if (count >= 1 && count <= 4) {
                    budget = budget * 0.25;
                } else if (count >= 5 && count <= 9) {
                    budget = budget * 0.40;
                } else if (count >= 10 && count <= 24) {
                    budget = budget * 0.50;
                } else if (count >= 25 && count <= 49) {
                    budget = budget * 0.60;
                } else if (count >= 50) {
                    budget = budget * 0.75;
                }


                break;
            case "Normal":
                ticket = 249.99;
                if (count >= 1 && count <= 4) {
                    budget = budget * 0.25;
                } else if (count >= 5 && count <= 9) {
                    budget = budget * 0.40;
                } else if (count >= 10 && count <= 24) {
                    budget = budget * 0.50;
                } else if (count >= 25 && count <= 49) {
                    budget = budget * 0.60;
                } else if (count >= 50) {
                    budget = budget * 0.75;
                }

                break;

        }
        double moneySpent = ticket * count;
        if (budget >= moneySpent) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - moneySpent));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - moneySpent));
        }

    }
}
