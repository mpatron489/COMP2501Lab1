package bcit.lesson1.lab.Bank;

/**
 * @author Mitchel
 * @version 0.01
 * Instantiates a Bank account for a member and carries out some transactions for the account.
 */
public class Bank {

    private double balanceCad;
    private String accountNumber;
    private String memberLastName;

    public Bank(final double balanceCad, final String accountNumber, final String memberLastName)
    {
        this.balanceCad = balanceCad;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * Prints the balance of the member's account.
     */
    public void printBalance()
    {
        System.out.println(balanceCad);
    }

    /**
     * Prints the member's last name.
     */
    public void printMemberLastName()
    {
        System.out.println(memberLastName);
    }

    /**
     * Prints the member's account number.
     */
    public void printAccountNumber()
    {
        System.out.println(accountNumber);
    }

    /**
     * Withdraws amount from balanceCad as long as there is enough money
     * @param amount
     */
    public void withdraw(double amount)
    {
        if (amount < 0 || amount > balanceCad) {
            System.out.println("There is not enough money in the account or you have entered an invalid amount.");
        }
        else {
            this.balanceCad = balanceCad -= amount;
        }
    }

    /**
     * Deposits positive amount to balanceCad
     * @param amount
     */
    public void deposit(double amount)
    {
        if (amount <= 0){
            System.out.println("Please enter a positive amount.");
        }
        else {
            this.balanceCad = balanceCad += amount;
        }
    }

    /**
     * Transfers amount from invoked member to recipient member.
     * @param amount
     * @param account2
     */
    public void transfer(double amount, Bank account2)
    {
        this.withdraw(amount);
        account2.deposit(amount);
    }

}
