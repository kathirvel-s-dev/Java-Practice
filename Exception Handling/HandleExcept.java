public class HandleExcept{
    public static void main(String[] args){
        int a=10;
        int b=0;
        
            try{
                System.out.println(a/b);
            }catch(ArithmeticException ae){
                System.out.println("b Should be greater than 0");
            }
            
            
    }
}