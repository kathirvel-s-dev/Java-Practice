public class TamilNadu extends SouthIndia{
        static String capital="Chennai";
        void speakLanguage(){
            System.out.println("tamil language");
        }

    void eat(){
         System.out.println("rice ");
    }

    void dress(){
         System.out.println("vetty and shirts");
    }

    void cultivate(){
         System.out.println("rice and sugar cane cultivation");
    }

    void livingStyle(){
         System.out.println("above aveerage devleopment");
    }


    public static void main(String[] args){
        SouthIndia si=new TamilNadu("modi");
        
        System.out.println(India.capital);
        System.out.println(TamilNadu.capital);
    }
}