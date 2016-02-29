import java.util.ArrayList;

public class CombinationIterative {

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
		if(wordList.isEmpty())
			return ;

		if(wordList.size()==1)
			System.out.println(wordList.get(0));
		
		ArrayList <String> combinations = new ArrayList<>();
		for(int i=0;i<wordList.get(0).size();i++)
			combinations.add(wordList.get(0).get(i));
		
		for(int k=1; k<wordList.size();k++){
			ArrayList <String> tempList = new ArrayList<>();
			for(String s: combinations)
				for(int i=0;i<wordList.get(k).size();i++)
				{
					tempList.add(s+" "+wordList.get(k).get(i));
				}
			combinations = tempList;
		}
		System.out.println(combinations.size());
		for(int i=0;i<combinations.size();i++)
			System.out.println(combinations.get(i));
	}
}
