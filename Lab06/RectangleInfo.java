import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;

        do //Enter the width
        {
            System.out.println("Enter the width: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);
        done = false;
        do //Enter the height
        {
            System.out.println("Enter the height: ");
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", which is not valid.");
            }
        } while(!done);

        area = width * height;
        System.out.println("The area is: " + area);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("The diagonal is: " + diagonal);
    }
}