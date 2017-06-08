
public class SeleniumBank implements Rbi {
	private String name;
	private int accountNumber;
	private String address;
	private double balance;

	public SeleniumBank(String name, int accountNumber, String address, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.address = address;
		this.balance = balance;

	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= 0) {
			balance = balance - amount;
		} else {
			System.out.println("you didn't have sufficient balance");
		}

	}

	@Override
	public double getBalance() {
		return balance;
	}


}
