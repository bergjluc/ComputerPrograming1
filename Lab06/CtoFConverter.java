import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;
        double step1 = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Enter the temperature in celcius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                step1 = celsius * 1.8;
                fahrenheit = step1 + 32;
                System.out.println("The temperature in faherenheit is " + fahrenheit);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);

    }
}
