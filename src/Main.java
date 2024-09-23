public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double interest_Rate = .15;
        double monthleyInterest;

         monthleyInterest = balance * interest_Rate;
         balance = balance + monthleyInterest;

        System.out.println("The interest due after 1 month is " + monthleyInterest);
        monthleyInterest = balance * interest_Rate;
        System.out.println("The interest due after 2 months is " + monthleyInterest);

    }
}