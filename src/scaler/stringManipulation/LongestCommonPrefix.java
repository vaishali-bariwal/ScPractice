
public class LongestCommonPrefix
{
    public  static String longestCommonPrefix(String[] s) 
    {
       
        int n = s.length;
        int min = s[0].length();
        for (int i = 1; i < n; i++)
        {
            if (s[i].length() < min)
            {
                min = s[i].length();
            }
        }
        String result = ""; 
        char tem = 'A';
        System.out.println(tem=='a');
        char curr; 
 
        for (int i = 0; i < min; i++)
        {
            
            curr = s[0].charAt(i);
 
            for (int j = 1; j < n; j++)
            {
                if (s[j].charAt(i) != curr)
                {
                    return result;
                }
            }
 
            result += (curr);
        }
        System.out.println(result);
        return (result);
        }
        //HashSet<Character> pre = new HashSet<>();

    public static void main(String[] args) {
        String a[] = {"ABCD","abcd"};
        System.out.println(longestCommonPrefix(a));
        
    }
}