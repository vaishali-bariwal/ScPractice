package scaler.stringManipulation.FilpBinaryString;

public class Solution {
    public static int[] flip(String s) {
        
        int n = s.length();
        int sum = Integer.MIN_VALUE;
        int curr_sum = 0,start = 0, end = 0,count1=0;
        int l =0,r=0;
        for (int i = 0; i < n; i++) {

            if(s.charAt(i)=='0')
                curr_sum +=1;
            else{
                curr_sum+=-1;
                count1++;
            }
            if(sum < curr_sum){
                sum = curr_sum;
                start = l;
                end  =  i;

            }
            if(curr_sum < 0){
                curr_sum = 0;
                l = i+1;
            }
            
        }
        if(count1 == n)
            return new int[0];
        int res[] =new int[2];
        res[0] = start+1; res[1] = end+1 ;
        return res;
    }
    public static void main(String[] args) {
        
        String s = "011";
        print(flip(s));
    }
    public static void print(int[] a)
    {
    	int m = a.length;
    	for(int i = 0;i < m;i++)
        {
           System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
