public class Solution {
    public int solve(int A, int B) {
        // index multiple of 3 contains even numbers 1 1 2 3 5 8 13 21 34
        
       int n = B-A+1;// count total number of  elements between A to B
       int even = 0;// initialize with zero
       
       // find total number of multiples of 3 in between index 1 to A.and subtract this from total number of multiple of 3 (1 to B)
       //if A= 36 mean multiple of 3 we should include it in result not subtract it that why we have use -1 here
       
       A = A % 3 ==0 ? A / 3 - 1: A/3;
       
       //find total number of multiples of 3 in between index 1 to A
        B = B / 3 ;
         
        //total even number between A to B
         even = B - A;
         
         //to find odd number between A to B;
         int odd = n - even;
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solve(30, 36));
    }
}
