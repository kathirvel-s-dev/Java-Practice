package Compare;



public class Employees implements Comparable<Employees>{ //making this class as a comparable nature by implimenting comparable interface 
	String name;
	int age;
	String dept;
	int salary;
	
	public Employees(String name,int age,String dept,int salary) {
		this.name=name;
		this.age=age;
		this.dept=dept;
		this.salary=salary;
		
	}
	public static void main(String[] args) {
		

	}
	
	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + "]";
	} // overriding tostring method for print a object
	@Override
	public int compareTo(Employees emp) {  // this compreto method unimplimented method from comparable interface so we are overriding here
		System.out.println(this.salary + " "+emp.salary);
		return this.salary-emp.salary;
		
	}
	
	
}
