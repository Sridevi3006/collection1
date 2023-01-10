package collection1;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("sridevis",6801317,"java developer",55000,'f',true);
		Employee e2=new Employee("rahuldeepak",12345,"software developer",95000,'m',true);
		Employee e3=new Employee("sowmiya",680131,"java developer",60000,'f',false);
		Employee e4=new Employee("deepak",456789,"sql",300000,'m',false);
		
		ArrayList<Employee>em=new ArrayList<>();
		em.add(e1);
		em.add(e2);
		em.add(e3);
		em.add(e4);
		
		Employee max=em.get(0);
		
		for(int i=0;i<em.size();i++) {
		//System.out.println(em.get(i).getName());
		}
		
		
		for(Employee e:em) {
			//System.out.println(e.getEmployeeId());
		}
		//em.forEach(x->{System.out.println(x.getRole());});
		
		
		
		for(Employee y:em) {
			if(y.getGender()=='f') {
				//System.out.println(y);
			}
		}
		
		
		for(Employee c:em) {
			if(c.getEmployeeId()%2==0) {
				//System.out.println(c.getEmployeeId()+" is even");
			}
			else {
				//System.out.println(c.getEmployeeId()+" is odd");
			}
				
		}
		
		
		em.forEach(d->{
			if(d.getIsVaccinated()==true) {
				//System.out.println(d);
			}
		});
		for(int i=0;i<em.size();i++) {
			if(em.get(i).getName().startsWith("s")) {
				//System.out.println(em.get(i));
			}
		}
		for(Employee s:em) {
			if(s.getGender()=='m'&& s.getIsVaccinated()) {
				//System.out.println(s);
			}
		}
		
		em.forEach(b->{
			if(b.getSalary()>50000 && b.getSalary()<=100000) {
				//System.out.println(b);
			}
		});
		for(int i=0;i<em.size();i++) {
			if(em.get(i).getName().length()>=max.getName().length()) {
				max=em.get(i);
				
			}
		}
			//System.out.println(max);
		
			ArrayList<Employee>maleemployee=new ArrayList<>();
			for(Employee a:em) {
				if(a.getGender()=='m') {
					
					//System.out.println(a);
				}
			}
			ArrayList<Employee>maxsalary=new ArrayList<>();
			for(Employee z:em) {
				if(z.getSalary()>=50000) {
					maxsalary.add(z);
				}
				System.out.println(z);
			}
			
			
			
		}
		
		}



	


