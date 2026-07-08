public class ExceptionTest{
        String name;

        public ExceptionTest(String name){
            this.name=name;
        }
    public static void main(String[] args){
        // System.out.println("Helloo");
     
     try{
        int[] arr=new int[5];
        arr[5]=10;

     }catch(ArrayIndexOutOfBoundsException abe){
        System.out.println("index out of range");
     }finally{
        System.out.println("finally");
     }
        



        ExceptionTest et=new ExceptionTest("Kathirvel");



       
    }
}