public class Account {
    private double MoneyDeposit;
    private int year;
    private double rate;

    public Account (int year, double deposit, double rate) {
        this.MoneyDeposit = deposit;
        this.year = year;
        this.rate = rate;
    }

    public double getMoneyDeposit()
    {
        return MoneyDeposit;
    }

    public int getYear()
    {
        return year;
    }

    public double getRate()
    {
        return rate;
    }

    public String toString()
    {
        return "Welcome. Your balance is " + MoneyDeposit + " in year 1. Hypothetically, You have had this account for " + year + " years.";
    }


    public String InterestRateTotal()
    {
        double totalEarnings = MoneyDeposit;
        double interestEarned;
        for (int i = 1; i <= year; i++)
        {
            interestEarned = totalEarnings * rate;
            totalEarnings = totalEarnings + interestEarned;
        }

        totalEarnings = Math.round(totalEarnings * 100.0) / 100.0;

        return "You are currently in year " + year + " giving you a total of $" + totalEarnings + ", Thank you for banking with us!";

    } 
}
