
public class BankAccount {
	private String name;
	private int accountNumber;
	private String address;
	private double balance;

	public BankAccount(String name, int accountNumber, String address, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.address = address;
		this.balance = balance;

	}
/**
 * this method is used to draw the money
 * @param amount amount that should be withdraw
 */
	public void withdraw(double amount) {
		if(balance - amount >= 0) {
		balance = balance - amount;
		} else{
			System.out.println("you didn't have sufficient balance");
		}
	}
/**
 * we can deposit in this method
 * @param amount we should deposit amount 
 */
	public void deposit(double amount) {
		balance = balance + amount;

	}
/**
 * we can check the bal in this method
 * @returns balance amount
 */
	public double getBalance() {
		return balance;
	}
}
