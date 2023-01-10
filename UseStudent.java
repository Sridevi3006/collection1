package collection1;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s=new Student("sridevi",680137,24,false,'s');
		Student s1=new Student("sowmiya",680136,26,false,'a');
		Student s2=new Student("rahul",680171,25,true,'s');
		Student s3=new Student("deppak",680151,23,true,'a');
		
		ArrayList<Student> st=new ArrayList<>();
		st.add(s);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		ArrayList<Student>range=new ArrayList<>();
		for(Student sa:st) {
			if(sa.getExamnum()>680170) {
				range.add(sa);
			}
		}
		//range.forEach(x->System.out.println(x));
		
		
		ArrayList<Student>grade=new ArrayList<>();
		st.forEach(y->{
			if(y.getGrade()=='a') {
				grade.add(y);
				
			}
		});
		grade.forEach(z->System.out.println(z));
		
		
		

	}

}
