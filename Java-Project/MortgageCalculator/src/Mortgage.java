import java.util.Scanner;

public class Mortgage{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final float number_Of_Months = 12;
        final float percent = 100;
        float principalAmount, totalDuration, rateOfInterest;

        while(true){     // Principal Amount Error Handling
            System.out.print("Principal Amount ($1K - $1M) : ");
            principalAmount = scanner.nextFloat();
            if(principalAmount >= 1_000 && principalAmount <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while(true){     // Period
            System.out.print("Time Duration (In Years): ");
            totalDuration = scanner.nextFloat();
            if(totalDuration >= 1 && totalDuration <= 30)
                break;
            System.out.println("Enter a number between 1 and 30.");
        }

        while(true){
            System.out.print("Rate of Annual Interest (In Percentage): ");
            rateOfInterest = scanner.nextFloat();
            if(rateOfInterest > 0 && rateOfInterest <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        float rateOfInterestMonthly = (rateOfInterest / number_Of_Months) / 100;
        float totalDurationMonths = totalDuration * number_Of_Months;
        float ram = (float) Math.pow((1 + rateOfInterestMonthly), totalDurationMonths);
        float ans = (float) (principalAmount * ((rateOfInterestMonthly * Math.pow((1 + rateOfInterestMonthly), totalDurationMonths)) / (Math.pow((1 + rateOfInterestMonthly), totalDurationMonths) - 1)));
        System.out.println("Total Mortgage is : " + ans + " !");
    }
}