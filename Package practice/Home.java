package tambaram;
import velachery.Theatre;

public class Home{

    public static void main(String[] args){
        Home person=new Home();
        Theatre samePerson=new Theatre();
        samePerson.watch();  ///this works bcz we access method from it class from here
        person.study();

        // person.watch(); // this throws er bcz watch method is from another class we cant access it 
    }

    public void study(){
        System.out.println("learning java");
    }
}