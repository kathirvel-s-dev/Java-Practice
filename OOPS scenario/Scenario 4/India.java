public  abstract class India{
    public India(String primeminister){
        System.out.println("our Prime Minister is" + primeminister);
    }

    static String capital="New Delhi";

    abstract void speakLanguage();

    abstract void eat();

    abstract void dress();

    public static void main(String[] args){
        System.out.println("");
    }
}