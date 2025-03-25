import java.util.Scanner;

public class HelloWorld
{


    public static void main(String_Ex[] args)
    {
        System.out.println("Hello, World!");

        int i = 50;

        System.out.println(i++ / 3.0);

        i++;

        System.out.println(++i / 3.0);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            display_message("You have enter : " + number);
            
            System.out.print("Ok to exit ? : " );

            char sc = scanner.next().charAt(0);

            if (sc == 'Y' || sc == 'y')
            {
                display_message("Thank you. Good bye !");

            } else{
                display_message("I am sorry you said no!");
            }
        }

        display_message("Total tax is : " + calc_tax(5000, 0.02));
    }

    static void display_message(String msg)
        {
            System.out.println(msg);
    }

    static double calc_tax(double amount, double tax)
    {
        return amount * tax;
    }
}