package BASIC.Additional_Problems_MIX.ConditionalsAdv;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {             // 100/100
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();                       //Winter”, “Spring” или “Summer”;
        String typeGroup = scanner.nextLine();                    //boys”, “girls” или “mixed”;
        int count = Integer.parseInt(scanner.nextLine());         //	Брой на учениците
        int countNights = Integer.parseInt(scanner.nextLine());   //	Брой на нощувките
        String sport = "";
        double total = 0;

        switch (season) {
            case "Winter":
                if (typeGroup.equals("girls")) {
                    sport = "Gymnastics";
                    total = count*countNights * 9.60;
                }
                else if (typeGroup.equals("boys")) {
                    sport = "Judo";
                    total = count*countNights * 9.60;
                }
                else if (typeGroup.equals("mixed")) {
                    sport = "Ski";
                    total = count*countNights * 10;
                }

                break;
            case "Spring":
                if (typeGroup.equals("girls")) {
                    sport = "Athletics";
                    total = count*countNights * 7.20;
                }
                else if (typeGroup.equals("boys")) {
                    sport = "Tennis";
                    total = count*countNights * 7.20;
                }
                else if (typeGroup.equals("mixed")) {
                    sport = "Cycling";
                    total = count*countNights * 9.50;
                }

                break;
            case "Summer":
                if (typeGroup.equals("girls")) {
                    sport = "Volleyball";
                    total = count*countNights * 15;
                }
                else if (typeGroup.equals("boys")) {
                    sport = "Football";
                    total = count*countNights * 15;
                }
                else if (typeGroup.equals("mixed")) {
                    sport = "Swimming";
                    total = count*countNights * 20;
                }

                break;
        }
        if (count >= 50) {
            total = total * 0.50;
        } else if (count >= 20 && count < 50) {
            total = total * 0.85;
        } else if (count>=10 && count<20){
            total = total * 0.95;
        }
        System.out.printf("%s %.2f lv.", sport, total);
    }
}
