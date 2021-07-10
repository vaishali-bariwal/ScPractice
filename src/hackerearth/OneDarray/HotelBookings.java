package hackerearth.OneDarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class HotelBookings {
	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
	        
	       Collections.sort(arrive);
	       Collections.sort(depart);
	       ArrayList<String> al = new ArrayList<>();
	       for(int k =0; k < arrive.size();k++)
	       {
	    	   al.add(arrive.get(k)+"A");
	       }
	       for(int k =0; k < depart.size();k++)
	       {
	    	   al.add(depart.get(k)+"D");
	       }
	       Collections.sort(al);
	       int roomsRequired=0,i=0;
			while(i < al.size() && roomsRequired<=K)
			{
				if(al.get(i).contains("A") ){
					i++;
					roomsRequired++;
				}
				else if(al.get(i).contains("D") ) {
					i++;
					roomsRequired--;
				}
			}
			if(roomsRequired<=K){
				return true;
			}else{
				return false;
			}
	}
	
	public static void main(String []args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);a.add(2);a.add(3);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(2);b.add(3);b.add(4);
		HotelBookings h = new HotelBookings();
		System.out.println(h.hotel(a, b, 1));
	}


}
