public class ActorSivakumar implements Actor {

    ActorSivakumar(int age,String car){

    }

    ActorSivakumar(){

    }

    static String address="Coimbatore";
    public void act(){
        System.out.println("can act");
    }

    public void dance(){
        System.out.println("can dance");
    }

    public void sing(){
        System.out.println("can sing");
    }

    public void speaking(){
        System.out.println("can speak");
    }

    public static void main(String[] args){

        ActorSivakumar as=new ActorSivakumar(65,"Audi car");

        Actor ac=new ActorSivakumar(); //dynamic binding creating obj for another class 
// ac object is act as a actor interface it can only access actor interface state and behaviours
        ac.sing();
        ac.dance();
        ac.act();
        // ac.speaking();  // this throws error bcz we can only acces the actor class overriden methods
        System.out.println(ac.address); //chennai -bcz its on actor interface it access address of actor interface


        // as.dance();
        // as.sing();
        // as.act();
        // as.speaking();

        // System.out.println(as.address);

    }

}