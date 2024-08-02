import java.util.Scanner;

public class Mortgage{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final float number_Of_Months = 12;
        final float percent = 100;

        System.out.print("Principal Amount: ");
        float principalAmount = scanner.nextFloat();

        System.out.print("Time Duration (In Years): ");
        float totalDuration = scanner.nextFloat();

        System.out.print("Rate of Annual Interest: ");
        float rateOfInterest = scanner.nextFloat();

        rateOfInterest = rateOfInterest / number_Of_Months;
        float totalDurationMonths = totalDuration * number_Of_Months;
        float ram = (float) Math.pow((1 + rateOfInterest), totalDurationMonths);
        float ans = (float) (principalAmount * ((rateOfInterest * Math.pow((1 + rateOfInterest), totalDurationMonths)) / (Math.pow((1 + rateOfInterest), totalDurationMonths) - 1)));
        System.out.println("Total Mortgage is : " + ans + " !");
    }
}