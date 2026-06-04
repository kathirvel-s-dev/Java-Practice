public class Pack{
    public void show(){
    System.out.println("helloo");
    }

    public int calc(){
        int a=10;
        return a+7;
    }

    public Pack(){
        System.out.println("constructor ");
    }

    public Pack(int num){
        System.out.println(num);
    }

    public static void main(String[] args ){
        System.out.println(args);
        Pack obj=new Pack();
        int num =obj.calc();
        System.out.println(num);
        
        obj.show();
        
        Pack obj2=new Pack(1);
        
    }

}



