package collectionLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapLearning {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Tata Nexon");
		hm.put(2, "Tata tiago");
		hm.put(3, "Tata Harrier");
		hm.put(4, "Tata Altroz");
		
		System.out.println(hm);
		
		//Modification
		
		hm.put(1, "Santro");
		System.out.println(hm);

		
		//remove
		
		hm.remove(2, "Tata tiago");
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> entry : hm.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		for(Map.Entry<Integer, String> entry  : hm.entrySet()) {
			
			
			
		}
		
		
	}

}
