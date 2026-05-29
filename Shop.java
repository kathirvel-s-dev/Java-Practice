public class Shop{


static int age=20;

static String name;

String prod_name;

public static void main(String[] args){

Shop product=new Shop();
product.prod_name="First product";

Shop product2=new Shop();
product2.prod_name="Second product";

System.out.println("Hello World");
System.out.println(Shop.age);
System.out.println(Shop.name);
System.out.println();
System.out.println(product.prod_name);
}
}
