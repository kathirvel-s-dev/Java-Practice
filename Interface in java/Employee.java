public class Employee implements Company{

    public Employee(){
        System.out.println("employee constructor");
    }
    public void takeLeave(){
        System.out.println("8 days");
    }

    public void getSalary(){
        System.out.println("20,000");
    }

    public static void main(String[] args){
        Employee emp=new Employee();

        // Company com=new Company();

        emp.takeLeave();
        System.out.println();
    }
}