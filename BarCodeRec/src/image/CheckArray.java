package image;

import java.util.ArrayList;
import java.util.List;

public class CheckArray {
	 public boolean check(ArrayList<Integer> list){
	        
	        List list2 = new ArrayList<Integer>();
	        boolean premierecondition = false;
	        boolean deuxiemecondition = false;
	        
	        for (Integer val : list) {
	            if(!list2.contains(val) && list2.size()<2) {
	                list2.add(val);
	            }
	            else if(list2.contains(val)) {}
	                
	            else {
	                System.out.println("1");
	                return false;
	            }
	        }
	        
	        premierecondition = true;
	        
	        int taille = list.size();
	        int premierelement = list.get(0);

	        for(int i=1;i<list.size();i++) {
	            if((i==1 || i==(taille/2) || i==((taille/2)-1) || i==taille-1 || i==taille-2) && !(list.get(i)==premierelement))
	            {
	               // System.out.println("2, i :"+i+" elem :" +list.get(i)+ " 1er-elem:"+premierelement);
	                return false;
	            }
	        }
	        
	        deuxiemecondition = true;
	        
	        if(premierecondition && deuxiemecondition)
	            return true;
	        System.out.println("3");
	        return false;
	        
	    }
}
