public  class Parent{

    private int price = 10000;

    public void getPrice(){
        System.out.println(price);
    }

    public void setPrice(int price){
        if (price>=this.price)
            this.price=price;
        else
            System.out.println("Input is greater than Price");
    }
    public static void  main(String[] args ){

        Parent parent=new Parent();
        System.out.println("helloo");
        System.out.println();
    }
}