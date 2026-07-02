package india.newDelhi;
public class CommonManInDelhi implements TrafficRulesDelhi{

    public void dontGoByDieselVehicle(){
        System.out.println("dont go by diesel vehicle");
    }
    public void goByBicycle(){
        System.out.println("go by bicycle");
    }
    public static void main(String[] args){
        CommonManInDelhi cmdl=new CommonManInDelhi();
        cmdl.dontGoByDieselVehicle();        
    }
}