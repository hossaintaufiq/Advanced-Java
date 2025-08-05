public class SavingsAccount implements BankAccount{
    private double balance;
    public SavingsAccount(){
        this.balance=0.0;
    }

    public void withdraw(double amount) throws withdrawalException{
        if(amount>balance){
            throw new withdrawalException("Insufficient funds.");
        }
        else if(amount<=0){
            System.out.println("Amount must be positive");
        }
        else {
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        }
    }

    @Override
    public void deposit(double amount) {
        balance +=amount;
    }

    public double getBalance(){
        return balance;
    }
}
