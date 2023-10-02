import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int number = 0;
        int guess = 0;
        String trash = "";
        boolean done = false;

        number = random.ints(1,10).findFirst().getAsInt();

        do
        {
            System.out.println("Enter your number guess: ");
            if(in.hasNextInt())
            {
                 guess = in.nextInt();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);

        if (number == guess)
        {
            System.out.println("Your guess " + guess + ", is equal to " + number);
        }
        else if (number < guess)
        {
            System.out.println("Your guess " + guess + ", is more than " + number);
        }
        else
        {
            System.out.println("Your guess " + guess + ", is less than " + number);
        }
    }
}