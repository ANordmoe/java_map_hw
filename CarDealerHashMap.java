// You are a car dealer. Create a hash map of vehicles.
// The model is the Key, the make is the Value.
// Ask the customer what car (model) they are looking for. Use the Hash Map to 
// determine if you have that vehicle, and what make it is.
// (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
// Submit to your GitHub and provide a link to your repository

import java.util.HashMap;
import java.util.Scanner;

public class CarDealerHashMap {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("What model are you looking for?");
        String model = input.nextLine();

        input.close();
        
        HashMap<String, String> vehicles = new HashMap<>();

        vehicles.put( "Civic", "Honda");
        vehicles.put("Accord", "Honda");
        vehicles.put("Taurus", "Ford");
        vehicles.put("Escort", "Ford");      

        if (vehicles.containsKey(model)){
            System.out.println("Oh, you're looking for a " + model + "? Our " + vehicles.get(model) + "section is right over here ... ");
        } else {
            System.out.println("Sorry, tough luck!");
        }
    }
}
