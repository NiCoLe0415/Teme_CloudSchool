import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BusStation {

    public void showAllVehicles(List<Vehicle> arrayOfVehicles){
        for(Vehicle vehicle:arrayOfVehicles){
            System.out.println(vehicle.display());
        }

    }

    public double showTotalProfit(List<Vehicle> arrayOfVehicles){
        double sum=0;
        for(Vehicle vehicle:arrayOfVehicles){
            sum=sum+vehicle.profit();
        }
        return sum;
    }

    public void sortVehicles(List<Vehicle> arrayOfVehicles){
        Collections.sort(arrayOfVehicles);
        for(Vehicle vehicle:arrayOfVehicles){
            System.out.println(vehicle.display()+" "+"profit= "+vehicle.profit());
    }



}}
