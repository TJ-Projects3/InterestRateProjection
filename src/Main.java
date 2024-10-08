import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you own an account? Please enter: Yes or No");
        String response = input.nextLine();

        if(response.equalsIgnoreCase("yes"))
        {
            System.out.println("Procceed...");
        }  
        else
            System.out.println("Throw an exception");

        System.out.println("Let's get some information on your account. State your account amount (no $)");
        double deposit = input.nextDouble();
        System.out.println("How many years of interest do you want to project?");
        int year = input.nextInt();
        System.out.println("Interest rate (must be in decimal form as a percentage)");
        double interest = input.nextDouble();
        input.nextLine();

        Account newAccount = new Account(year, deposit, interest);

        System.out.println("What is the name on this account?");
        String name = input.nextLine();

        if(name instanceof String)
        {
            System.out.println(newAccount.toString());
        }

        if(name.isEmpty() == false)
        {
            System.out.println("Would you like to know your interest? Please enter: Yes or No");

            String result = input.nextLine();

        if(result.equalsIgnoreCase("yes") )
        {
            System.out.println(newAccount.InterestRateTotal());
        }
        else
            System.out.println("OK, Logging out. Thank you.");
        }

    }

}
