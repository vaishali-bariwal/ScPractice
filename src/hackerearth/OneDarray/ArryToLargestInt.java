package hackerearth.OneDarray;

import java.util.Arrays;

public class ArryToLargestInt {
	public static  String largestNumber(final int[] nums) {
	        
		int n = nums.length;
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
        
        StringBuilder sb = new StringBuilder();
        for(String str : s){
            sb.append(str);
        }
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
	    }
	public static void main(String[] args) {
		
		int a[] =  {3, 30, 34, 5, 9};
		String r = largestNumber(a);
		System.out.println("****************RESULT************");
		System.out.println(r);
	}

}
