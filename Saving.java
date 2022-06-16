
/*
- Mahmoud Gamal Ahmed Hassanein
- Luxor City
 */
package BankingSystem;

public class SavingsBankAccount extends BankAccount
{
    private double minimumBalance;

    public SavingsBankAccount()
    {
        super(1000);
        minimumBalance = 1000;
    }
    public SavingsBankAccount(double balance){
        super(balance);
        minimumBalance=1000;
    }

    public double getMinimumBalance()
    {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance)
    {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw(double amountOfMoney)
    {
        if(balance-amountOfMoney>=minimumBalance){
            balance-=amountOfMoney;
            return true;
        }
        System.err.println("invalid amount");
        return false;
    }

    @Override
    public boolean deposit(double amountOfMoney)
    {
        if(amountOfMoney<100){
            System.err.println("invalid amount");
            return false;
        }
        balance+=amountOfMoney;
        return true;
    }
    
    
    
    
    
}
