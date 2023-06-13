package collectionLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class ArraySorting {

	@Test
	public void operation() {
		
		List<Integer> numbers = new ArrayList<Integer>(); 
		
		numbers.add(100);
		numbers.add(300);
		numbers.add(400);
		numbers.add(600);

		System.out.println(numbers);
		
		for(int i=0; i<=numbers.size()-1; i++) {
			
			System.out.println(numbers.get(i));
			
			Collections.sort(null);
				
			}
		}
		
	}


