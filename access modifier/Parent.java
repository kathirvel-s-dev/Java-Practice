package chennai;
public class Parent{

    protected Parent(int i){

    }

    protected Parent(){
        
    }


    protected int pin=1234;

    public static void main(String[] args){ /// why this is shows in runtime time error
        Parent parent=new Parent(10);
        parent.task();
        System.out.println(parent.pin);
        System.out.println("heloo");
    }



    protected void task(){
        System.out.println("working");
    }
}