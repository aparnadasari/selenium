
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

	public void withdraw(double amount) {
		if(balance - amount >= 0) {
		balance = balance - amount;
		} else{
			System.out.println("you didn't have sufficient balance");
		}
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public double getBalance() {
		return balance;
	}
}
