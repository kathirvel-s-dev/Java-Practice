public class Methods{

    static String name ="kathir";
    String course="java fullstack";
    public static void main(String[] args){

        Methods person1=new Methods();

        System.out.println(person1.course);
        person1.status();
        System.out.println(name);

        void status(){
            System.out.println("learning");
        }
    }
}