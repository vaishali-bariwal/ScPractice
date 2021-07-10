package hackerearth.OneDarray;

import java.util.Arrays;

public class MinimizeDifference {
	
	public static int solve(int[] A, int B) {
	        
		int maxx = 0;
        int k = B;
        for (int i = 0; i < A.length; i++) {
            maxx = Math.max(maxx, A[i]);
        }

        int[] freq = new int[maxx + 1];
        Arrays.fill(freq, 0);

        for (int i = 0; i < A.length; i++) {
            freq[A[i]]++;
        }

        int i = 0, j = maxx;
        while (i < j) {

            if (freq[i] > freq[j]) {

                if (freq[j] <= k) { // perfrom decrement operation
                    freq[j - 1] = freq[j - 1] + freq[j];
                    k = k - freq[j];
                    j--;
                } 
                else {
                    break;
                }
            } else {
                if (freq[i] <= k) { // perfrom increment operation
                    freq[i + 1] = freq[i + 1] + freq[i];
                    k = k - freq[i];
                    i++;
                } 
                else {
                    break;
                }
            }
        }

        return j - i;
        }
public static void main(String[] args) {
		
		int a[] = {1, 1, 7};
		int r = solve(a,7);
		System.out.println("****************RESULT************");
		System.out.println(r);
	}

public static void print(int[] a) {
	for (int i : a) {
		System.out.print(i+" ");
	}
	System.out.println();
}



}
