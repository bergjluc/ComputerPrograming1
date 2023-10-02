import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double inches = 0;
        double feet = 0;
        double miles = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter the measure in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);

        inches = meters * 39.3700787402;
        System.out.println(meters + " meters is equivalent to " + inches + " inches.");
        feet = meters * 3.280839895;
        System.out.println(meters + " meters is equivalent to " + feet + " feet.");
        miles = meters * 0.0006213712;
        System.out.println(meters + " meters is equivalent to " + miles + " miles.");
    }
}