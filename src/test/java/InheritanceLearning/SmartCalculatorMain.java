package InheritanceLearning;

import org.testng.annotations.Test;

public class SmartCalculatorMain {
	
	@Test
	public void operation() {
		
		SmartCalculator smrtCalc = new SmartCalculator();
		
		int result = smrtCalc.add(2000, 3000);
		
		System.out.println(result);
		
	}
}
