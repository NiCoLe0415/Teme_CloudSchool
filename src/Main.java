import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehicle> arrayOfVehicles=new ArrayList<>();
        BusStation b=new BusStation();
        Vehicle b1=new Bus("red", true, 10,5.2);
        Vehicle t2=new Taxi("yellow", true,2,5);
        Vehicle b2=new Bus("blue", false, 0,5.2);
        Vehicle t3=new Taxi("yellow", true,3,5);
        arrayOfVehicles.add(b1);
        arrayOfVehicles.add(t2);
        arrayOfVehicles.add(b2);
        arrayOfVehicles.add(t3);


        b.showAllVehicles(arrayOfVehicles);
        System.out.println("====================");
        System.out.println(b.showTotalProfit(arrayOfVehicles));
        System.out.println("====================");

        b.sortVehicles(arrayOfVehicles);



    }
}
