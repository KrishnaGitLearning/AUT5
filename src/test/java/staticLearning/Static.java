package staticLearning;

public class Static {
	
	
	int rollnumber;
	String name;
	int marks1;
	int marks2;
	int marks3;
	static String collegeName = "Alpha";
	

	
	public Static(int rn,int m1,int m2,int m3) {
		
		rollnumber=rn;
		marks1 =m1;
		marks2=m2;
		marks3=m3;
		
	}
	
	public static void updatecollege() {
		
		collegeName = "Beta";
	}
	
	
	public void gradeCalculation() {
		
		
		int total = marks1+marks2+marks3;
		
		if (total>230) {
			
			System.out.println("Grade is A");
			
		}	else
				
				System.out.println("Grade is B");
			
		}
		
		
	}
	
	


