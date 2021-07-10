package hackerearth.OneDarray;

import java.util.Arrays;

public class UniqueElements {
	public static int solve(int[] a) {
		
		int count=0;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            while(a[i]>=a[i+1]){
                a[i+1]++;
                count++;
            }
        }
        for(int i=0;i<a.length-1;i++){
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        return count;
     
        }
	public static void main(String[] args) {
		
		int a[] = {1,2,2,2,2,3,3,4,5,6,6,7};
		int r = solve(a);
		System.out.println("****************RESULT************");
		System.out.println(r);
	}

}
