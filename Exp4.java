public class Exp4
{
	public static void main(String[] args) {
		int[] arr = new int[]{15,10,12};
		System.out.println(f(arr, arr.length));
	}
	
	static int f(int[] arr, int n){
	    int sum = 0;
	    for(int i = 0; i <= 31; i++){
	        int set = 0;
	        int unset = 0;
	        for(int j = 0; j < n; j++){
	            if((arr[j] & (1 << i)) > 0) set++;
	            else unset++;
	        }
	        
	        sum += 2 * set * unset;
	    }
	    
	    return sum;
	}
}