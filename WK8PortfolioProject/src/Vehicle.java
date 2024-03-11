import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;

public class Vehicle implements Serializable {
    private String make, model, color;
    private int year;
    private int mileage;
    //ArrayList<Vehicle> vehicleList = new ArrayList<>();
    public ArrayList<Vehicle> vehicleList = new ArrayList<>();
    //Overloaded Constructor
    public Vehicle(String mk, String mdl, String clr, int yr, int mlg) {

        make = mk;
        model = mdl;
        color = clr;
        year = yr;
        mileage = mlg;

      //  vehicleList.add();

    }
    //setter methods
    public void setMake(String mk)
    {
        try{
            make = mk;
            System.out.println("Success.");
        }catch(Exception e) {
            System.out.println("Incorrect input: make change failed.");
        }
    }
    public void setModel(String mdl)
    {
        try{
            model = mdl;
            System.out.println("Success.");
        }catch(Exception e) {
            System.out.println("Incorrect input: model change failed.");
        }
    }
    public void setColor(String clr)
    {
        try{
            color = clr;
            System.out.println("Success.");
        }catch(Exception e) {
            System.out.println("Incorrect input: color change failed.");
        }
    }
    public void setYear(int yr)
    {
        try{
            year = yr;
            System.out.println("Success.");
        }catch(Exception e) {
            System.out.println("Incorrect input: year change failed.");
        }    }
    public void setMileage(int mlg)
    {
        try{
            mileage = mlg;
            System.out.println("Success.");
        }catch(Exception e) {
            System.out.println("Incorrect input: mileage change failed.");
        }
    }
    // getter methods
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }

    //print method
    public void printVehicle() {
       // System.out.println("The vehicle's details are: ");
        System.out.println("Make: " + make );
        System.out.println("Model: " + model );
        System.out.println("Color: " + color );
        System.out.println("Year: " + year );
        System.out.println("Mileage: " + mileage );
        System.out.println();

    }
    //ArrayList<Vehicle> vehicleList1 = new ArrayList<>();
   // public void addVehicleToList(Vehicle vehicle){
    //    vehicleList1.add(vehicle);
   // }


}
