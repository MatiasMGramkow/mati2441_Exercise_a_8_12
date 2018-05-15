import java.util.Scanner;

public class Exercise12 {


    /*
    Add a field to the BankAccount class named transactionFee for a real number representing an amount of money
to deduct every time the user withdraws money. The default value is $0.00, but the client can change the value.
Deduct the transaction fee money during every withdraw call (but not from deposits). Make sure that the balance
cannot go negative during a withdrawal. If the withdrawal (amount plus transaction fee) would cause it to become
negative, don’t modify the balance at all.
     */
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Matias Moeskjaer Gramkow", 120, 0.00);
        BankAccount bank2 = new BankAccount("Emilie Lydolph", 260, 0.00);

        System.out.println(bank);

    }


    public static class BankAccount {
        Scanner sc = new Scanner(System.in);
        String name;
        double balance = 100;
        double transacionFee = 0.00;

        public void deposit(double amount) {
            balance = balance + amount;
        }


        public BankAccount(String name, double balance, double transacionFee) {
            this.name = name;
            this.balance = balance;
            this.transacionFee = transacionFee;
        }
        public String toString() {
            return name + ", " + balance;
        }
    }

}