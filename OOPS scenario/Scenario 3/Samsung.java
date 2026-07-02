public class Samsung extends FactoryDemo{

        void verifyFingerPrint(){
            System.out.println("fingerprint");
        }

        void providePattern(){
            System.out.println("pattern");
        }

        static int price=5000;




    public static void main(String[] args){
        Samsung samsung=new Samsung(); //constructor calls from smartphone
        samsung.browse();  //factory demo browse method calls 
        
        System.out.println(samsung.price); //5000 it access this class price 



    }
}