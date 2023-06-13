package collectionLearning;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ExceptionHandling {

	@Test
	public void exceptionlearning() {

		int a, b;
		boolean flag = false;
		int flow = 0;
		Scanner sc = null;
		int result;

		while (flag == false) {

			sc = new Scanner(System.in);
			System.out.println("Enter the value");
			a = sc.nextInt();
			System.out.println("Enter the value");
			b = sc.nextInt();
			try {
				result = a / b;
			} catch (ArithmeticException obj) {

				obj.printStackTrace();
				result = a / b;

				System.out.println("Arithmetic Exception Handled: ");

			}
			System.out.println(result);

			System.out.println("Do you want to continue 0 for yes 1 for no: ");
			flow = sc.nextInt();
			if (flow == 1) {
				break;
			}

		}

	}
}
