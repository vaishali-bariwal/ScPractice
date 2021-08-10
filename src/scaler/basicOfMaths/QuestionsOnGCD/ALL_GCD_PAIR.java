package scaler.basicOfMaths.QuestionsOnGCD;

import java.util.Arrays;

 class Solution {
    public int[] solve(int[] a) {
        int n = a.length;
        int size = (int)Math.sqrt(n);
        Arrays.sort(a);
        //1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 2 2 11 11 11 14 22 23 31
        int freq[] = new int[a[n-1] + 1];
        for (int i = 0; i < n; i++) {
            freq[a[i]]++;
        }
        int res[] = new int[size];
        int j = 0;
        for (int i = n-1; i >= 0 ; i--) {
            
            if(freq[a[i]] > 0 && j < size){
                res[j] = a[i];
                freq[a[i]]--;
                j++;
                for(int k = 0;k < j;k++){
                    if(k != j)
                    {
                        int t = gcd(a[i], res[k]);
                        freq[t] -= 2;
                    }
                }
            }
        }
        return res;    
    }
    public static int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        
        int a[] = {1, 31, 1, 1, 1, 1, 14, 2, 1, 1, 1, 2, 22, 1, 11, 1, 1, 1, 1, 23, 1, 1, 11, 1, 11 };
        int res[] = new Solution().solve(a);
        print(res);
    }
    public static void print(int a[]) {
        
        for (int i : a) {
            System.out.print(" "+i);
        }
        System.out.println();
    }

   
}
