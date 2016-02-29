import java.util.ArrayList;

public class FindNonDuplicate {
	public static void main(String [] args){
	int arr [] = {1,1,2,3,4,3,6};
	ArrayList <Integer> nonDups = findNonDuplicate(arr);
	System.out.println(nonDups);
	}
	
	public static ArrayList<Integer> findNonDuplicate(int arr[]){
		ArrayList<Integer> my_list = new ArrayList<>();
		ArrayList<Integer> my_list2 = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			
				arr[arr[i]%arr.length] += arr.length;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]/arr.length)==1)
			{
				my_list.add(i);
				//System.out.println(arr[i]-arr.length+" "+i);
			}
			else
				my_list2.add(arr[i]%arr.length);
		}
		return my_list;
		
	}
}
