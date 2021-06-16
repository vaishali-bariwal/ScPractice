package hackerearth.OneDarray;

public class GroupColor {
	
	public static int[] sortColors(int[] a) {
	        
	        int count0 = 0;
	        int count1 = 0;
	        int count2 = 0;
	        
	        for(int i  = 0;i < a.length; i++)
	        {
	            if(a[i]==0){
	                count0++;
	               
	            }
	            if (a[i]==1){
	                count1++;
	            }
	            if (a[i]==2)
	            {
	                count2++;
	            }
	        }
	        System.out.println(a.length+" "+count0+" "+count1+" "+count2);
	        for(int j  = 0;j < count0 ; j++){
	            a[j] = 0;
	        }
	        for(int i  = count0;i < count1+count0 ; i++){
	        	a[i] = 1;
	        }
	        for(int i  = count1+count0;i < count2+count1+count0 ; i++){
	            a[i] = 2;
	        }
	        return a;
	        
	    }
	
	public static void main(String[] args) {
		int a[] =  { 2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2 };
		int r [] = sortColors(a);
		System.out.println("****************RESULT************");
		for(int i : r)
		{
			System.out.print(i +" ");
		}
	}

}
