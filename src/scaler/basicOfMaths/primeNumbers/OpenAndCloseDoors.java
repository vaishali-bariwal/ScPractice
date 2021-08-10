package scaler.basicOfMaths.primeNumbers;
class Solution {
    // only perfect square door will remain open 
    public int solve(int A) {
        int count = 0;
        for(int i = 1; i*i <= A;i++ )
        {
            if ((A % i == 0) && (n / i == i))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().solve(10));
    }
}

