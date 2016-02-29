
public class MaximumSubArray {

	public static void main(String [] args){
		int arr[] ={1,-2,3,4,-5};
		CustomData object = find_maximum(arr,0,4);
		System.out.println(object.p1+""+object.p2);
	}
	public static CustomData find_maximum(int arr[], int low, int high){
		if(low==high) // has only one element
			return new CustomData(low, high, arr[low]);
		int mid = (low+high)/2;
		CustomData left_object = find_maximum(arr,low,mid);
		CustomData right_object = find_maximum(arr,mid+1, high);
		CustomData cross_object = cross_maximum(arr,low,mid,high);
		
		if((left_object.maximum>=right_object.maximum)&&(left_object.maximum>=cross_object.maximum)){
			return left_object;
		}
		else if((left_object.maximum<=right_object.maximum)&&(cross_object.maximum<=right_object.maximum)){
			return right_object;
		}
		else
		return cross_object;
	}
	
	public static CustomData cross_maximum(int arr[], int low, int mid, int high){
		
		int left_maximum = Integer.MIN_VALUE;
		int right_maximum = Integer.MIN_VALUE;
		int i=mid,j=mid+1,sum=0;
		int left=0, right=0;
		while(i>=low)
		{
			sum = sum+arr[i];
			if(sum >left_maximum){
				left_maximum = sum;
				left = i;
			}
			i--;
		}sum=0;
		while(j<=high)
		{	sum+=arr[j];
			if(right_maximum < sum){
				right = j;
			right_maximum = sum;}
			j++;
				
		}
		//System.out.println(""+left+" "+right+" ");
		return new CustomData(left, right, left_maximum+right_maximum);
	}
}

class CustomData{
	int p1;
	int p2;
	int maximum;
	public CustomData(int p1,int p2,int maximum){
		 this.p1=p1;
		this.p2 = p2;
		this.maximum = maximum;
	}
}
