package collection1;

import java.util.ArrayList;

public class StudentName {
	public static void main(String[] args) {
		ArrayList<String>studentname=new ArrayList<>();
		studentname.add("sridevi");
		studentname.add("sowmiya");
		studentname.add("rahul");
		studentname.add("sky");
		studentname.add("akshaya");
		
		for(int i=0;i<studentname.size();i++) {
			//System.out.println(studentname.get(i).charAt(0));
			
		}
		
		
		studentname.forEach(x->{
			if(x.length()>4) {
				//System.out.println(x);
			}
		});
		
		
		for(int i=0;i<studentname.size();i++) {
			if(studentname.get(i).contains("a")||studentname.get(i).contains("e")||studentname.get(i).contains("i")||studentname.get(i).contains("o")||studentname.get(i).contains("u")) {
			//System.out.println("it contains vowels");
		}
		else {
			//System.out.println("does not contains vowels");
		}
			
			
		
	}
	}

}
