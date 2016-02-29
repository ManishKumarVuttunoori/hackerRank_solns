import java.util.Arrays;

public class PositiveNegative {
	public static void main(String []args){
	      int arr[] = {-1,-2,-4,-5,-6,-3,-8,-12,-9};
	      int s,j,k,e;
	      s = 0;
	      e = arr.length-1;
	      if(e==1){
	    	  System.out.println(arr[0]);
	      	  return;
		  }
	      		
	      while(s<e && arr[s]<0){
	    	  s++;
	      }
	      while(e>s && arr[e]>=0){
	    	  e--;
	      }
	      System.out.println(s+" "+e);
	      j = s;
	      k = e;
	      while(s<e){
	    	  while(j<=e && arr[j]>=0){
	    		  j++;
	    	  }
	    	  
	    	  if(j<=e){
	    		  //shift all the
	    		  int temp = arr[j];
	    		  for(k =j-1;k>=s;k--){
	    			  arr[k+1]=arr[k];
	    		  }
	    		  arr[s++]=temp;
	    	  }
	    	  while(s<e && arr[s]<0){
		    	  s++;
		      }
		      while(e>s && arr[e]>=0){
		    	  e--;
		      }
		      j = s;
		      //System.out.println(s+" "+e);
		      
	      }      
	      System.out.println(Arrays.toString(arr));
	}
	
	static void  swap(int[] arr,int i,int j){
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
}
