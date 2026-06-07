public class Samsung extends Mobile{

    public Samsung(String name){
        super(name);  //bcz here super default super refers to their parent class
        System.out.println("samsung-construtor..");
    }

    public static void main(String[] args){
        System.out.println("working");
        Samsung samsung=new Samsung("name");  //why mobile constructor calls first 
        samsung.calling();
        samsung.internet();
    }

    public void internet(){
        System.out.println("internet samsung class");
    }
}