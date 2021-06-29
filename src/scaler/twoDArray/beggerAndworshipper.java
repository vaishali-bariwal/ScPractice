package scaler.twoDArray;

import java.util.Iterator;

public class beggerAndworshipper {
public static int[] solve(int a, int[][] b) {
        
        int n = b.length;
        int[] arr = new int[a];
        
        for (int i = 0; i < n; i++) {
        	
        	arr[b[i][0]-1] += b[i][2];
        	
        	if(b[i][1] < a) {
        		arr[b[i][1]] += -1 * b[i][2];
        	}		
		}
        
        int sum  = 0;
        for (int i = 0; i < a; i++) {
        	
        	sum += arr[i];
        	arr[i] = sum;
			
		}
        
        return arr;
        
        
    }
public static void main(String[] args) {
	
	int[][] a = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
	System.out.println("money after all distriution");//10, 55, 45, 25, 25
	int r[] = solve(5,a);
	for (int i = 0; i < r.length; i++) {
		System.out.print(r[i]+" ");
	}
}

}
