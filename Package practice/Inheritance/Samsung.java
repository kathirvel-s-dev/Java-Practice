public class Samsung extends Mobile{
    public static void main(String[] args){
        Samsung samsung=new Samsung();
        samsung.calling();
        samsung.message();  /// this works bcz wee can acces through the extend keyword another class
        // samsung.calling(); // err bcz method not found cannot find symbol
    }
}