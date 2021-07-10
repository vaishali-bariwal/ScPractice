package hackerearth.OneDarray;

import java.util.HashMap;

public class ContiguousArray {

	public static int solve(int[] a) {
		
		int n = a.length;
		HashMap<Integer, Integer> hM= new HashMap<Integer, Integer>();
	    int sum = 0;
	
	    int max_len = 0;
	    int ending_index = -1;
	    int start_index = 0;
	
	    for (int i = 0; i < n; i++) {
	        a[i] = (a[i] == 0) ? -1 : 1;
	    }
	
	    for (int i = 0; i < n; i++) {
	        
	    	sum += a[i];
	        if (sum == 0) {
	            max_len = i + 1;
	            ending_index = i;
	        }
	        // we can say that if sum is repeating there is subarray inbetween where sum = 0 
	        if (hM.containsKey(sum)) {
	            if (max_len < i - hM.get(sum)) {
	                max_len = i - hM.get(sum);
	                ending_index = i;
	            }
	        }
	        else 
	            hM.put(sum, i);
	    }
	
	    for (int i = 0; i < n; i++) {
	        a[i] = (a[i] == -1) ? 0 : 1;
	    }
	
	    return max_len;

    }
	public static void main(String[] args) {
		int[] a = {1, 0, 1, 0, 1,1,0,1,1,0,1};
		System.out.println(solve(a));
	}
}
