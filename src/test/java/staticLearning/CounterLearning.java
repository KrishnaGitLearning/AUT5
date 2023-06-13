package staticLearning;

public class CounterLearning {
	
	
	static int flag=0;
	
	public CounterLearning() {
		flag++;
		System.out.println(flag);
		
	}
	
	
	
	public static void main(String[] args) {
		
		CounterLearning counter=new CounterLearning();
		CounterLearning counter1=new CounterLearning();
		CounterLearning counter2=new CounterLearning();
		CounterLearning counter3=new CounterLearning();
		
		
	}
}


