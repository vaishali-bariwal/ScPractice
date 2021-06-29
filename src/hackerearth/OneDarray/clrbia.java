package hackerearth.OneDarray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] entities = br.readLine().split(","); 
        String s;               // Reading input from STDIN
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        s = br.readLine();
        while(s != "" )
        {
        	//System.out.println("s"+s+"e");
        	String re[] = s.split(" ");
            hm.put(re[0]+"_"+re[3], Integer.parseInt(re[2]));
            s = br.readLine();
           
        }
       

        int n = entities.length;
        int j = n-1,k= j-1;
        while( j <= n-1&& j >= 0 && k >=0)
        {
            String key1 = entities[k]+"_"+entities[j];
            if(hm.containsKey(key1))
            {
            	if(j-k == 2)
            	{
            		String key2 = entities[j-1]+"_"+entities[j];
            		if(hm.containsKey(key2)){
            			int temp = hm.get(key1)/hm.get(key2);
            			hm.put(entities[k]+"_"+entities[j-1],temp);
            			j--;
            		}
            	}
            	else if(j-k >2) {
            		if(k+1 < n)
            		{
            			String key2 = entities[k+1]+"_"+entities[j];
            			if(hm.containsKey(key2)) {
            				int temp = hm.get(key1)/hm.get(key2);
                			hm.put(entities[k]+"_"+entities[k+1],temp);
            			}
            		}
            	}
            	
            		k--;
            		j--;
            	
                 
            }
           else { 
               j++;
            }
        }
		/*
		 * for(Map.Entry<String,Integer> h : hm.entrySet()) {
		 * System.out.println(h.getKey()+"  "+h.getValue());
		 * 
		 * }
		 */
        String prev = "";
        int pre_no = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < entities.length-1;i++)
        {
            String key = entities[i]+"_"+entities[i+1];
            if(hm.containsKey(key))
            {
                if(prev == "")
                {
                    sb.append(pre_no+entities[i]+" = ");//+hm.get(key));
                    pre_no = hm.get(key);
                    prev = entities[i];
                }
                else
                {
                    sb.append(pre_no+entities[i]+" = ");
                    pre_no *= hm.get(key);
                    prev = entities[i];
                }
            }
            else{
                }
            
        }
        sb.append(pre_no+entities[entities.length-1]);
        System.out.print( sb.toString());

    }
}
