package scaler.Backtarcking;

import java.util.ArrayList;

public class BalacedparennthesisPermutation {
    public static ArrayList<String> al = new ArrayList<>();
    public String[] generateParenthesis(int A) {
        
        
        if(A==1)
         return new String[]{"()"};
        StringBuilder sb = new StringBuilder();
        FindAllpermute(sb ,A ,0, 0);
        int n = al.size();
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = al.get(i);
            //System.out.println(res[i].length());
        }
        for (String string : res) {
            System.out.println(string);
        }
        al.clear();
        return res;
        
    }
    public static void FindAllpermute(StringBuilder sb, int n, int open, int close)
    {
        if(close == n && close == open) 
        {
            al.add(sb.toString());
            return;
        }
        if(open > n && close > n)
            return;
        
        if(open < n) {
            sb.append("(");
            FindAllpermute(sb, n, open+1, close);
            sb.deleteCharAt(sb.lastIndexOf("("));
        }
        if(open > close) {
            sb.append(")");
            FindAllpermute(sb, n, open, close+1);
            sb.deleteCharAt(sb.lastIndexOf(")"));
        }
        return;
    }
    public static void main(String[] args) {
        String[] res = new BalacedparennthesisPermutation().generateParenthesis(4);
        System.out.println("output");
        for (String string : res) {
            System.out.println(string);
        }
    }
}
