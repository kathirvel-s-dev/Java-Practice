public abstract class SmartPhone{

    public SmartPhone(){
        System.out.println("Smartphone uder development");
    }


    abstract int call(int seconds);

    abstract void sendMessage();

    abstract void receiveCall();

    void browse(){
        System.out.println("smartphone browsing");
    }

    
}