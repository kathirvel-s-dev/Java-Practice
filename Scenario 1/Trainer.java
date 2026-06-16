public class Trainer{
    
    Trainer (String dept,String institute){
        this.dept=dept;
        this.institute=institute;

    }

    String dept="Java";

    String institute=" Payilagam";

    private int salary=10000;

    public int getSalary(){
        return salary;
    }

    public void training(){
        System.out.println("training");
    }

    public static void main(String[] args){
        Trainer trainerKumar=new Trainer("CSE" ,"Payilagam");
        trainerKumar.training();

    }




}