import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        Vehicle myVehicle = new Vehicle("Ford", "F150", "Red", 2004, 5500);
        vehicleList.add(myVehicle);
        Vehicle myVehicle2 = new Vehicle("Ford", "F250", "Blue", 2005, 5500);
        vehicleList.add(myVehicle2);
        Vehicle myVehicle3 = new Vehicle("Ford", "F350", "Green", 2006, 5500);
        vehicleList.add(myVehicle3);
        boolean exit = false;
        int choice = 0;
        while (!exit) {
            try {
                System.out.println("Please enter a selection:" + "\n1. Print Inventory."
                        + "\n2. Add vehicle(s) to inventory" + "\n3. Clear Inventory." +"\n4. Save output to file."+ "\n5. Exit");
               choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a choice 1 - 4.");
                break;
            }  //if input = 1 Print inventory
               switch (choice){
                   case 1:
                       boolean ans = vehicleList.isEmpty();
                       if (ans)
                           System.out.println("The Vehicle List is empty.");
                       else
                           for (Vehicle c : vehicleList) {
                        c.printVehicle();
                    }
                   break;

                   case 2://if input = 2 Add vehicles to inventory
                       System.out.println("How many Vehicles do you need to enter? ");
                       int i = input.nextInt();
                       for (int j = 0; j < i; j++) {
                           System.out.println("Please enter the vehicle make: ");
                           String make = input.next();
                           System.out.println("Please enter the vehicle model: ");
                           String model = input.next();
                           System.out.println("Please enter the vehicle color: ");
                           String color = input.next();
                           System.out.println("Please enter the vehicle Year: ");
                           int year = input.nextInt();
                           System.out.println("Please enter the vehicle mileage: ");
                           int mileage = input.nextInt();
                           Vehicle newVehicle = new Vehicle(make, model, color, year, mileage);
                           vehicleList.add(newVehicle);

                       }
                       break;
                   case 3: //if input = 3 clear inventory
                       vehicleList.clear();
                       System.out.println("After clearing the list the inventory is empty.");
                       break;
                   case 4:// Save to file
                       try{
                           FileOutputStream writeData = new FileOutputStream("vehicles.txt");
                           ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

                           writeStream.writeObject(vehicleList.toString());
                           writeStream.flush();
                           writeStream.close();

                       }catch (IOException e) {
                           e.printStackTrace();
                       }
                   case 5: //if input = 5 exit
                       exit = true;
                       break;
                }


        }
    }

}