package scaler.Recursion;

import java.util.ArrayList;

public class ParanthesisPermutation {

    public static ArrayList<String> al = new ArrayList<>();
    public static String[] generateParenthesis(int A) {
        
        char[] str = new char[2 * A];
        FindAllpermute(str , 0 ,A ,0, 0);
        int n = al.size();
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = al.get(i);
        }
        return res;
        
    }
    public static void FindAllpermute(char str[], int pos, int n, int open, int close)
    {
        if(close == n) 
        {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            al.add(sb.toString());
        }
        else
        {
            if(open > close) {
                str[pos] = '}';
                FindAllpermute(str, pos+1, n, open, close+1);
            }
            if(open < n) {
                str[pos] = '{';
                FindAllpermute(str, pos+1, n, open+1, close);
            }
        }
    }

    public static void main(String[] args) {
        int a = 4;
        String[] res = generateParenthesis(a);
        for (String string : res) {
            System.out.println(string);
        }
    }
}
