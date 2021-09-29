//3. Is 13 a prime number?
package DevLabs_Assignments;

public class Is13aPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, n = 13, i = 2, m;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}
}
