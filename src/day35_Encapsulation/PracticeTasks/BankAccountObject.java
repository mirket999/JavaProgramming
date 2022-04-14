package day35_Encapsulation.PracticeTasks;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Omer_Demirel", 248778522, 12500.50);
        System.out.println(account1);
        account1.deposit(2600);
        System.out.println(account1);
        //account1.withdraw(-2000);
        //System.out.println(account1);
        account1.checkbalance();
    }
}
