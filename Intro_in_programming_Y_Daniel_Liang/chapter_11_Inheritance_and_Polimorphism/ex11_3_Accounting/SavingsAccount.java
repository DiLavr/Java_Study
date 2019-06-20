package ex11_3_Accounting;

/**
 * Chapter 11 Exercise 3:
 */
public class SavingsAccount extends Account {

    protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    
    public void withdraw(double amount) {
        if (mBalance - amount >= OVERDRAFT_LIMIT) {
        	        
        	super.withdraw(amount);
        }
    }
    
  
    public String toString() {
        return "SavingsAccount Balance = $" + mBalance;
    }
}