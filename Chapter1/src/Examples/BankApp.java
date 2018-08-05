/*
 * Name: Nikhil Ranjan Nayak
 * Regd No: 1641012040
 * Desc: Bank App
 */
package Examples;

public class BankApp {

   public static void main(String[] args) {
      BankAccount ba1 = new BankAccount(100.00);

      System.out.print("\nBefore transactions - ");
      ba1.display();

      ba1.deposit(74.35);
      ba1.withdraw(20.00);

      System.out.print("\nAfter transactions - ");
      ba1.display();
   }
}

class BankAccount {
   private double balance;

   public BankAccount(double openingBalance) {
      balance = openingBalance;
   }

   public void deposit(double amount) {
      balance += amount;
   }

   public void withdraw(double amount) {
      balance -= amount;
   }
  
   public void display() {
      System.out.println("\nBalance = " + balance);
   }
}