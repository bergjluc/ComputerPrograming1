import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double gasPrice = 0;
        double gallonsPer100Miles = 0;
        double pricePer100Miles = 0;
        double currentTankMiles = 0;
        String trash = "";
        boolean done = false;

        do //Enter gallons in the tank
        {
            System.out.println("Enter the number of gallons in the tank: ");
            if(in.hasNextDouble())
            {
                gallons = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);
        done = false;
        do //Enter the mpg
        {
            System.out.println("Enter the miles per gallon: ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);
        done = false;
        do //Enter the gas price
        {
            System.out.println("Enter the price of gas: ");
            if(in.hasNextDouble())
            {
                gasPrice = in.nextDouble();

                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);

        gallonsPer100Miles = 100 / mpg;
        pricePer100Miles = gallonsPer100Miles * gasPrice;
        System.out.println("The price to go 100 miles is: $" + pricePer100Miles);

        currentTankMiles = gallons * mpg;
        System.out.println("The current tank will last " + currentTankMiles + " miles.");
    }
}