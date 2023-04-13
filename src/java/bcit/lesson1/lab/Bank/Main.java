package bcit.lesson1.lab.Bank;
/**
 * @author Mitchel
 * @version 0.01
 */

public class Main {
    public static void main(String[] args)
    {
        Bank b1 = new Bank(100.00,"abc123", "gates");
        Bank b2 = new Bank(500.00,"xyz789", "woods");

        b1.printBalance();
        b1.withdraw(5.00);
        b1.printAccountNumber();
        b1.printBalance();

        System.out.println("---");

        b2.printBalance();
        b2.deposit(23.00);
        b2.printMemberLastName();
        b2.printBalance();

        System.out.println("---");

        b1.transfer(50.00, b2 );
        b1.printBalance();
        b2.printBalance();

    }

    }



