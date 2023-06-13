package collectionLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class ArrayListLearning {

	@Test

	public void ArrayListOperation() {

		List<String> carNames = new ArrayList<String>();

		carNames.add("Audi");
		carNames.add("Porsche");
		carNames.add("Swift");
		carNames.add("i10");

		System.out.println(carNames);
		carNames.remove(3);
		System.out.println(carNames);

		carNames.add(3, "Tata");
		System.out.println(carNames);

		carNames.set(2, "Fiat");
		System.out.println(carNames);

		// for(int i = 0; i<carNames.size(); i ++)// {

		System.out.println(carNames.get(2));
		// }

		for (String s : carNames) {

			System.out.println(s);
			
			Iterator itr = carNames.iterator();
			while (itr.hasNext()) {
			 System.out.println(itr.next());
			
			}
			
			
			
		}

	}

}
