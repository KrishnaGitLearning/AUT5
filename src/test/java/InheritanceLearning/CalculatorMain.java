package InheritanceLearning;

import org.testng.annotations.Test;

@Test
public class CalculatorMain {
	
	
	public void operation() {
	
	Calculator object = new Calculator();
	int result = object.add(10, 20);
	
	System.out.println(result);
}
}