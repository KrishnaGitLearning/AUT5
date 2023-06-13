package InheritanceLearning;

import org.testng.annotations.Test;

public class ScientificCalculatorMain {

	@Test
	public void operation() {

		ScientificCalculator sci = new ScientificCalculator();

		int result = sci.add(100, 200);
		System.out.println(result);

	}

}
