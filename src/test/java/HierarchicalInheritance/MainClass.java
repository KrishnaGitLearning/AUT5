package HierarchicalInheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC operation = new ClassC();
		int result = operation.addition();
		System.out.println(result);
		
		
		ClassB operation1 = new ClassB();
		operation1.addition();

		
	}

}
