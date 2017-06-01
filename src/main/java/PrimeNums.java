
public class PrimeNums {
	public static void main(String[] args) {
		int a = 100;
		for (int i = 1; i <= a; i++) {

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					System.out.println(i);

				}
			}

		}
	}
}
