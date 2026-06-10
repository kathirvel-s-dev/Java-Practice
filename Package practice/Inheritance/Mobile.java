public class Mobile{

            public Mobile(){
            System.out.println("mobile- constructor");
        }
    public static void main(String[] args){



        Mobile mobile=new Mobile();
        mobile.calling();
        mobile.message();
        System.out.println("Hellooo ");
        
    }

    public void calling(){
        System.out.println("calling feature");
    }
    public void message(){
        System.out.println("message feature");
    }
}