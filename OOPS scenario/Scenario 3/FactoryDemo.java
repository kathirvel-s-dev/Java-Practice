public abstract class FactoryDemo extends SmartPhone{
    // adding abstract methods
    abstract void verifyFingerPrint();
    abstract void providePattern();

   void  receiveCall(){

    }
   void sendMessage(){ //missed return type void

    }
    int call(int sec){
        return sec;  //err give a ; fro return
    }

    boolean isOriginalPiece=false;
    static int price=0;

    void browse(){
        System.out.println("Factory demo browsing ");
    }
}