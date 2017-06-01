
public class TestAccount {
	public static void main(String[] args) {
		BankAccount aparna = new BankAccount("Aparna D", 1234, "hyd", 500.99);
		BankAccount sandhya = new BankAccount("Sandhya D", 5678, "hyd", 999.99);
		aparna.deposit(99.01);
		double x = aparna.getBalance();
		System.out.println(x);
		aparna.withdraw(200);
		x = aparna.getBalance();
		System.out.println(x);
		aparna.deposit(400);
		x = aparna.getBalance();
		System.out.println(x);
		sandhya.withdraw(1000);
		double y = sandhya.getBalance();
		System.out.println(y);
	}
}
