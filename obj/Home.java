public class Home{
    int num;
    String str;
    int price;
    public Home(int num,String str,int price){
        this.num=num;
        this.str=str;
        this.price=price;
    }
    public Home(){
        System.out.println("heloo");
    }
    public static void main(String[] args){
        Home h=new Home(24,"Street 1",30);
        Home h2=new Home(24,"Street 1",40);
        h.display(h2);

    }

    public static void display(h){
        Home h3=new Home();
        System.out.println(h3,num);
        System.out.println(this.price);
    }
    
}