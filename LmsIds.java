package collection1;

import java.util.ArrayList;

public class LmsIds {
	public static void main(String[] args) {
		ArrayList<Integer> lmsIds=new ArrayList<>();
		lmsIds.add(570);
		lmsIds.add(982);
		lmsIds.add(839);
		lmsIds.add(1031);
		lmsIds.add(778);
		
		Integer min=lmsIds.get(0);
		for(int i=0;i<lmsIds.size();i++) {
			//System.out.println(lmsIds.get(i));
		}
		
		
		for(Integer id:lmsIds) {
			//System.out.println(id);
		}
		//lmsIds.forEach(x->System.out.println(x));
		
		
		
		for(int i=lmsIds.size()-1;i>0;i--) {
			//System.out.println(lmsIds.get(i));
			
		}
		
		
		for(Integer id:lmsIds) {
			if(id%2==0) {
				//System.out.println(id +" is even");
			}
			else {
				//System.out.println(id +" is odd");
			}
		}
		
		
		for(Integer id:lmsIds) {
			if(id<min) {
				min=id;
			}
		}
		System.out.println(min);
		
	
	for(int i=550;i<=850;i++) {
		//System.out.println(i);
	}
	
	}
	

}
