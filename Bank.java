class Bank
{
    double amount;
    Bank(double amount)
    {
        this.amount=amount;
    }
    void deposit(double deposit)
    {
        amount=amount+deposit;
        System.out.println("deposit successful");
    }
    void withdraw(double withdraw)
    {
        if (amount>=withdraw)
        {
            amount = amount - withdraw; 
            System.out.println("withdraw done:");
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
    void enqury()
    {
        
        System.out.println(amount);
    }

    public static void main(String[] args)
    {
        Bank bank=new Bank(10000);
        bank.deposit(2000);
        bank.withdraw(2000);
        bank.enqury();
        
    }
}