
package velachery;

public class Theatre{
    public Theatre(){
        System.out.println("constructor");
    }

    public static void main(String [] args){
        Theatre person=new Theatre();
        person.watch();

    }

    public void watch(){
        System.out.println("watch blast movie");
    }

}