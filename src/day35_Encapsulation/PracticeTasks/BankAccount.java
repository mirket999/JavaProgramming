package day35_Encapsulation.PracticeTasks;

public class BankAccount {
    //BankAccount Task:
    /*
    create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments
     */
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, long accountNumber, double balance){
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Invalid amount: " + amount);
            System.exit(1);
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if (amount>balance || amount<0){
            System.out.println("Invalid amount: " + amount);
            System.exit(1);
        }
        balance-=amount;
    }

    public void checkbalance(){
        System.out.println("Avaliable balance amount is: " + balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
