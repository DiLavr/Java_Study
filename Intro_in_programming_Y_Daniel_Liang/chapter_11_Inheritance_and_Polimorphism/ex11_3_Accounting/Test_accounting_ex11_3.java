/**
 * 
 * (Subclasses of Account) In Programming Exercise 9.7, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw funds. Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and then implement them. Write
a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods.
(The Account class) Design a class named Account that contains:
- A private int data field named id for the account (default 0).
- A private double data field named balance for the account (default 0).
- A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume all accounts have the same interest rate.
- A private Date data field named dateCreated that stores the date when the
account was created.
- A no-arg constructor that creates a default account.
- A constructor that creates an account with the specified id and initial balance.
- The accessor and mutator methods for id, balance, and annualInterestRate.
- The accessor method for dateCreated.
- A method named getMonthlyInterestRate() that returns the monthly
interest rate.
- A method named getMonthlyInterest() that returns the monthly interest.
- A method named withdraw that withdraws a specified amount from the
account.
- A method named deposit that deposits a specified amount to the account.

Draw the UML diagram for the class and then implement the class. (Hint: The
method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
is annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g., like 4.5%. You need to divide it by 100.)

 * 
 * 
 * 
 */

package ex11_3_Accounting;

public class Test_accounting_ex11_3 {

    public static void main(String[] args) {
    	
    	Account account = new Account(" Mr. Jones", 1122, 10000);
        account.setAnnualInterestRate(4.7);

        System.out.println(" \n Updated information for ID: " + account.getId() + " Balance: $" + account.getBalance());
      
        System.out.println("Depositing $2,787");         account.deposit(2787);
        System.out.println("Withdrawing $4,718");         account.withdraw(4718);
        System.out.println("\n \t Process operations");
        System.out.println(account);
        
        System.out.println("\n Updated information for ID: " + account.getId() + " at " + account.getDateCreated() + " Balance: $" + account.getBalance() + " \n");              

        CheckingAccount checkingAccount = new CheckingAccount(112, 400); // information for new classes
        SavingsAccount savingsAccount = new SavingsAccount(113, 400); //information for new classes

        System.out.println("Starting balance: ");
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);  
                
        System.out.println(" \n Deposit $200 to both accounts");
        checkingAccount.deposit(200);
        savingsAccount.deposit(200);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);      
        
        System.out.println(" \n WithDraw $500 from both accounts");
        checkingAccount.withdraw(500);       
        savingsAccount.withdraw(500);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);        
        
        System.out.println(" \n WithDraw $150 from both accounts");
        checkingAccount.withdraw(150);       
        savingsAccount.withdraw(150);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
                
    }
}
