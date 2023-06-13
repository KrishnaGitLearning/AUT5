package collectionLearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetLearning {
	
	@Test
	public void listExample() {
		
		List<String> car = new ArrayList<String>();
		car.add("Santro");
		car.add("Swift");
		car.add("i20");
		car.add("Santro");
		car.add("Swift");
		car.add("i20");
		
		System.out.println("List :" + car);
	}
	
	@Test
	public void treeSetLearn() {
		
		Set<String> car = new TreeSet<String>();
		car.add("Santro");
		car.add("Swift");
		car.add("i20");
		car.add("Audi");
		car.add("BMW");
		car.add("Zen");
		System.out.println("TreeSet : " +car);

	}
	@Test
	public void hashSetLearning() {
		
		Set<String> car = new HashSet<String>();
		car.add("Santro");
		car.add("Swift");
		car.add("i20");
		car.add("Santro");
		car.add("Swift");
		car.add("i20");
		System.out.println("hashSetLearning : "+ car);

	}
	@Test
	public void linkedHashSet() {
		
		Set<String> car = new LinkedHashSet<String>();
		car.add("Santro");
		car.add("Swift");
		car.add("i20");
		car.add("Audi");
		car.add("BMW");
		car.add("Zen");
		System.out.println("linkedHashSet : "+ car);

	}
		

		
		
	}

