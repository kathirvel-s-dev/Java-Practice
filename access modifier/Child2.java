package banglore;
import chennai.Parent;


public class Child2  extends Parent{
    public static void main(String[] args){
        Parent parent=new Parent();
        parent.task();
        
        System.out.println(parent.pin);
    }
}