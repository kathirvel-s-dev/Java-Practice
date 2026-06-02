public class SuperMarket{
    String name;
    int price;

    public SuperMarket(String name , int price){
        this.name=name; //this refers to current obj
        this.price=price; //if this notmentioned name considered as a local var as a priority
    }

    public static void main(String[] args){
        SuperMarket product1=new SuperMarket("product1's name",200);

        // product1.name="product1";
        // product1.price=200;
        System.out.println(product1.name);
        System.out.println(product1.price);
    }
}