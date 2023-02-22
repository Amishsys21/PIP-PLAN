package main.java.oops;
public class BankAccount {
    //Example of Encapsulation.
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }}
//}
//In this example, we have a class BankAccount that encapsulates the details of a bank account.
// The data members (accountNumber, accountHolderName, balance) are declared as private, which means they cannot be
// accessed directly from outside the class.
//        Instead, the class provides getter and setter methods for accessing and modifying the data members.
//The getter methods (getAccountNumber(), getAccountHolderName(), getBalance()) allow read-only access to the data
// members, while the setter methods (setAccountNumber(), setAccountHolderName()) allow modifying the data members
// in a controlled way.
//        The deposit() and withdraw() methods are also part of the encapsulation because they modify the balance data
//        member, but they are the only methods that can do so, and they have specific conditions for updating the balance.
//        By encapsulating the details of the BankAccount class, we ensure that the data is accessed and modified
//        in a controlled way, reducing the chances of accidental errors and improving the overall reliability of the program.


