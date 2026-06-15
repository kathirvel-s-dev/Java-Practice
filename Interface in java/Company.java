public interface Company{

    final  int number=10;
    
    public void takeLeave();

    public void getSalary();
public static void main(String[] args){

    Company com = new Company();
    com.number=20;
     System.out.println( number); // this works non static var can be acessed without obj? yes bcz there is default staic,final keyword in var 


}
   
}