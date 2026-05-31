package lop;

public class MainApp {

    public static void main(String[] args) {

        BankAccount b =
                new BankAccount("Omkar", 101, 5000);

        // insert into database
        b.saveAccount();

        // deposit
        b.deposit(1000);

        // withdraw
        b.withdraw(500);

        // display
        b.display();
    }
}