//Rene Sequeira
//Pseudocode critical thinking assignment 1
/*
 * Start
 * set restaurantName variable to name of restaurant
 * set restaurantAddress variable to address of restaurant
 * set city variable to city of restaurant location
 * set state variable to state of restaurant location
 * 
 * display restaurant name, restaurant address, city, state, and zip-code
 * end
 */





package firstAssignment;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String restaurantName = "EL Toro Loco Steakhouse";
		String restaurantAddress = "1970 Sw 8th St";
		String city = "Miami";
		String state = "Fl";
		int zipCode = 33135;
		
		
		System.out.print("\n\n"  + "\t" + restaurantName + "\n" +
						 "\t" + restaurantAddress + "\n" +
						 "\t" + city + "," + state + "," + zipCode);
		
	}

}
