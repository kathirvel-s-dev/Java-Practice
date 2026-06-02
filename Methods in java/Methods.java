public class Methods{

    static String name ="kathir";

    static void test(){
        System.out.println("working");
    }
    String course="java fullstack";
            int status(int  number,int number2){
            System.out.println("learning");
            System.out.println(number);

            return number+number2;
        };

        void status(int number1 ){
            System.out.println(number1);
        }

        void divide(int number){
            System.out.println(number/2);
        }

        void status(String name){
            System.out.println(name);
        }

    public static void main(String[] args){

        Methods person1=new Methods();
        boolean valid=34;

        System.out.println(person1.course);
        System.out.println(name);
        person1.status(10);
        person1.status("kathir");
        person1.status(true);
        
        int result=person1.status(10,5);
        person1.divide(result);
        System.out.println(result);
        System.out.println(name);
        person1.test();
        Methods.test();

    }
}