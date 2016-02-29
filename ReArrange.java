
public class ReArrange {

     public static void main(String []args){
      int arr[] = {-1,-2,4,5,6,-3,8,-12,9};
      int length = arr.length-1;
      
      divideArray(arr,0,length);
      printArray(arr,0,length);
     }

     public static void divideArray(int arr[], int low, int high){
     
    	if(low>=high)
            return;
        
    	int mid = (low+high)/2;
        
        divideArray(arr,low,mid);
        divideArray(arr,mid+1,high);
        mergeArray(arr, low, mid, high);
     }
     
     public static void mergeArray(int arr[], int low, int mid, int high)
     {
        
        int p1=low,p2=mid+1;
        while(p1<mid &&arr[p1]<=0)
        p1++;
        while(p2<high &&arr[p2]<=0)
        p2++;
        
        reverseArray(arr,p1,mid);
        reverseArray(arr, mid+1, p2-1);
        reverseArray(arr,p1,p2-1);
     }
     public static void reverseArray(int arr[], int x, int y){
         int temp =0;
         while(x<y)
         {
             temp = arr[x];
             arr[x] = arr[y];
             arr[y]  = temp;
             x++;
             y--;
         }
     }
     
     public static void printArray(int arr[],int low,int high){
         for(low=0; low<=high;low++)
         System.out.print(arr[low]+" ");
         
     }

}
