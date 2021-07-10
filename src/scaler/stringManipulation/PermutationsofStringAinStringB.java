package scaler.stringManipulation;

public class PermutationsofStringAinStringB {
	public static int solve(String a, String b) {
		
		int count = 0;
		int m = a.length(), n = b.length(),c=0;
		int frA[] = new int[26];
		int frWindow[] = new int[26];
		if(n < m) return 0;
		for(int i = 0; i < m;i++) {
			char ch = a.charAt(i);
			frA[ch-'a']++;
			frWindow[b.charAt(i)-'a']++;
		}
		for(int i = 0; i < 26;i++) {
			
			if(frA[i]!=frWindow[i])
				break;
			c++;
		}
		if(c==26)
			count++;
		for(int i = m; i < n;i++) {
			frWindow[b.charAt(i-m)-'a']--;
			frWindow[b.charAt(i)-'a']++;
			c = 0;
			for(int j = 0; j < 26; j++) {
				if(frA[j]!=frWindow[j])
					break;
				c++;
			}
			if(c==26)
				count++;
		}//abcbacabc
		
		return count;
    }
	
	public static void main(String[] args) {
		
		String A = "abc";
		String B = "abcbacabc";
		System.out.println(solve(A,B));
	}
}
