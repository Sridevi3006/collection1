package collection1;

public class Student {
	private String name;
	private int examnum;
	private int age;
	private boolean isMale;
	private char grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExamnum() {
		return examnum;
	}
	
	public void setExamnum(int examnum) {
		this.examnum = examnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student(String name, int examnum, int age, boolean isMale, char grade) {
		super();
		this.name = name;
		this.examnum = examnum;
		this.age = age;
		this.isMale = isMale;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", examnum=" + examnum + ", age=" + age + ", isMale=" + isMale + ", grade="
				+ grade + "]";
	}
	


}
