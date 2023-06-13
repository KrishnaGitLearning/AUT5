package collectionLearning;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CopyExceptionHandling {
	
	
	@Test
	public void arithmeticEH() {
		int a, b;
		boolean flag = false;
		int flow = 0;
		Scanner sc = null;
		int result =0;
		while (flag == false) {

			sc = new Scanner(System.in);
			System.out.println("enter a value");
			a = sc.nextInt();
			System.out.println("enter b value");
			b = sc.nextInt();
			try {
			 result = a / b;
			}catch(ArithmeticException obj) {
				obj.printStackTrace();
				b= 10;
				//result = a/b;
				System.out.println("Arithmetic exception handled :: ");
			}
			
			System.out.println(result);

			System.out.println("do you want to continue 0 for yes and 1 for no : ");
			flow = sc.nextInt();
			if (flow == 1) {
				break;
			}
		}
	}
}



