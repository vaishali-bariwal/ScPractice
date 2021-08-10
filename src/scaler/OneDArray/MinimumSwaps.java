package scaler.OneDArray;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwaps {
    public int solve(int[] a) {
        int ans = 0;
        int n = a.length;
        int b[] = Arrays.copyOf(a, n);
        Arrays.sort(b);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], i);
        }
        for (int i = 0; i < n; i++)
        {
 
            // This is checking whether
            // the current element is
            // at the right place or not
            if (a[i] != b[i])
            {
                ans++;
                int init = a[i];
                
                int j = hm.get(a[i]);
                int swap = a[i];
                a[j] = a[i];
                a[i] = swap;
                
                hm.put(init, hm.get(b[i]));
                hm.put(b[i], i);
            }
        }
        return ans;
        
    } 
    public static void main(String[] args) {
        
        int a[] = {2, 0, 1, 3 };
        int res = new MinimumSwaps().solve(a);
        System.out.println(res);
    }
    public static void print(int a[]) {
        
        for (int i : a) {
            System.out.print(" "+i);
        }
        System.out.println();
    }
    
}
