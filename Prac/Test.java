public class Test{

    static int num1=1;
    String name;
    int price;

        static public void action(){
            System.out.println("actions 1");
        };

        public Test(String name ,int price ){
            this.name=name;
            this.price=price;
            
        }  

        public Test(){
            System.out.println("constructor no args");
        }    /// no args constructor 


    public static void main(String [] args){
        System.out.println("Hellooo");
        System.out.println(Test.num1);

        Test group1=new Test("mobile" ,25000 );
        Test group2=new Test("laptop" ,30000);
        Test group3=new Test();  //is default constructor is equal to no args constructor ==> false

        // group1.num2=10;
        // group2.num2=20;
        group1.action();
        action();



        System.out.println(group1.name);
        System.out.println(group2.name);
        

        System.out.println();
    }
}