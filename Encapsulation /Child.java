public class Child extends Parent{
    public static void main(String[] args){
        Parent parent= new Parent();
        parent.getPrice();
        parent.setPrice(12000);
        System.out.println("Child class");
    }
}