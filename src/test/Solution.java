import java.util.*;
class test{

    public static String reverse(String s)
    {
        int n = s.length();
        int i = 0, j=n-1,k = 0;
        String sp = "";
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Character> hm = new HashMap<>();
        while(i < n && j >=0){

            char ch = s.charAt(j);
            if(hm.containsKey(i))
            {
                System.out.println("hm contains "+j+ " " +i);
                sb.append(hm.get(i)); 
                i++;
            }
            else if(Character.isLowerCase(ch)||Character.isUpperCase(ch))
            {
                sb.append(ch);
                i++;
                j--;
            }
            else {
                 hm.put(j,ch);
                 System.out.println("hm "+j);
                 j--;
            }
            

        }
        //Str = "inf##d"
        // = d##fni
        // abdc
        
       
// output = dfn##i 
        System.out.println(sb);
        return "";
    }

    public static void main(String[] args) {
        String s = "inf##d";
        System.out.println(reverse(s));
    }
}