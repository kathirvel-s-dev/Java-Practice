package chennai;
public class Child extends Parent
{

    public Child(int i ){

    }

    public Child(){
        super();
    }

    public static  void main(String[] args){
        Parent parent=new Parent(10);
        parent.task();
        System.out.println(parent.pin);
    }
}