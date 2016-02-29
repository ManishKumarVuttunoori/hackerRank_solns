import java.util.ArrayList;

public class CombinationsRecursive {
	public static void main(String [] args){
		// test data 
		ArrayList <ArrayList<String>> setsOfWords = new ArrayList<ArrayList<String>>();
		ArrayList<String> set1 = new ArrayList<String>();
		ArrayList<String> set2 = new ArrayList<String>();
		ArrayList<String> set3 = new ArrayList<String>();
		set1.add("Quick");
		set1.add("LAzy");
		set1.add("Fast");
		set2.add("Brown");
		set2.add("Black");
		set2.add("Grey");
		set3.add("Dog");
		set3.add("Fox");
		set3.add("Wolf");
		setsOfWords.add(set1);
		setsOfWords.add(set2);
		setsOfWords.add(set3);
		
		makeCombinations(setsOfWords);
	}
	public static void makeCombinations(ArrayList<ArrayList<String>> wordList){
		makeCombinationsRecursive(wordList,0,"");
	}
	public static void makeCombinationsRecursive(ArrayList<ArrayList<String>> wordList, int index, String output){
		if(wordList.size()==index)
		{	System.out.println(output);
			return;
		}
		for(int i=0;i<wordList.get(index).size();i++){
		makeCombinationsRecursive(wordList,index+1,output +" "+ wordList.get(index).get(i));
		
		}
	}
}
