package collectionLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//char [] cArray = Sentence		
		//declaring the string variable
		String Sentence = "A paragraph is a series of sentences that are organized and coherent, and are all related to a single topic";
		String [] wordArray = Sentence.split(" ");
		
		System.out.println("Total number of word in Paragraph : " + wordArray.length);
		
		Map<String, Integer> wMap = new HashMap<String, Integer>();
		
		for(String w : wordArray){
			
			
			if(wMap.containsKey(w)) {
				
				wMap.put(w, wMap.get(w)+1);
			
			}else
				
				wMap.put(w,1);
			
			
			System.out.println(w);
			
			
		}
				
		//System.out.println(wMap);
		
		
	}

}
