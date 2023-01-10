package collection1;

public class Employee {
	private String name;
	private int employeeId;
	private String role;
	private int salary;
	private char gender;
	private boolean isVaccinated;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	public void setIsVaccinated(boolean isVaccinated) {
		this.isVaccinated=isVaccinated;
	}
	public boolean getIsVaccinated() {
		return isVaccinated;
	}
	public Employee (String name,int employeeId,String role,int salary,char gender,boolean isVaccinated) {
		this.name=name;
		this.employeeId=employeeId;
		this.role=role;
		this.salary=salary;
		this.gender=gender;
		this.isVaccinated=isVaccinated;
	}
	public String toString() {
		return ("NAME: "+name+", EMPLOYEEID: "+employeeId+", DESIGNATION: "+role+", SALARY: "+salary+", GENDER: "+gender+", VACCINATED: "+isVaccinated);
		}
	}
