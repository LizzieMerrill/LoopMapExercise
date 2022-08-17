import java.util.*;

class HashMapExercise{
  public static void main(String[] args){
	Scanner scnr = new Scanner(System.in);
	  
    Map<String, String> makeByModel = new HashMap<String, String>();
	  makeByModel.put("Civic", "Honda");
	  makeByModel.put("CX-5", "Mazda");
	  makeByModel.put("Rav4", "Toyota");
	  makeByModel.put("F150", "Ford");
	  makeByModel.put("Accord", "Honda");
	  makeByModel.put("Corolla", "Toyota");
	  makeByModel.put("Silverado", "Chevrolet");
	  makeByModel.put("Corvette", "Chevrolet");
	  makeByModel.put("Mustang", "Ford");
	  makeByModel.put("Camry", "Toyota");
	  makeByModel.put("Escape", "Ford");
	  makeByModel.put("Outback", "Subaru");
	  makeByModel.put("Wrangler", "Jeep");
	  makeByModel.put("Charger", "Dodge");
	  makeByModel.put("Grand Cherokee", "Jeep");
	  
	  
	  introDialogue();
	  
	  //recursive method that prompts user until they select a valid option to browse, add or quit
	public static void introDialogue(){
		
	  System.out.print("Hello valued customer! Would you like to browse our current selection
			   of cars, or would you like to request a new car be added to our dealership?
			   (Answer 'b' to browse, 'a' to add new car or 'q' to quit): ");
			   
	  char customerChoice = scnr.next();
	  
	  switch(customerChoice){
		  case b:
		  	browseCars();
		  break;
		  case a:
		  	addCar();
		  break;
		  case q:
		 	 System.out.println("Thank you, come again!");
		  break;
		  default:
		  	System.out.println("Whoops, we didn't understand that! Please try again!");
		  	introDialogue();//repeats dialogue if user fails to select valid option
		  break;
	  }
			   
	}//end of introDialogue method
			   
			   
	public static void browseCars(){
		
		System.out.println("Do you have a specific car model in mind,
				   or would you like to see a list of what cars
				   are in stock right now? (Answer 'y' is you have
				   a model in mind, 'n' if you would like to 
				   list your options, or 'q' to quit): ");
				   
		char customerChoice2 = scnr.next();
				   
		switch(customerChoice2){
		  case y:
		  	System.out.println("What model is the car you're looking for? ");
			String carModel = scnr.nextLine();
			if(){
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...\n );
			}
			else{
				System.out.printf"We're terribly sorry, but we do not have %s model cars in stock right now.
						   Would you like to add them to our dealership? (Answer 'y' to add, 'b' to
						   browse again, 
			}
		  break;
		  case n:
		  	listSelection();
			System.out.print("Now, knowing this, ");
			browseCars();
		  break;
		  case q:
		 	 System.out.println("Thank you, come again!");
		  break;
		  default:
		  	System.out.println("Whoops, we didn't understand that! Please try again!");
		  	browseCars();//repeats dialogue if user fails to select valid option
		  break;
	  }
	}//end of browseCars method
			   
			   
	public static void addCar(){
		
	}//end of addCar method
			   
	public static void listSelection(){
	
	}//end of listSelection method
  }
}
/*Hash Map Tutorial Code

import java.util.*;

public class MapExample1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		Map<String, Integer> ageByName = null;
		
		//Map is another interface, thus you can only initialize
		//a sub-type of it, such as a HashMap
		
		/***************************************************/
		//Map<Key, Value>
		//THOSE ARE PARAMETERS OF ANY MAP
		/***************************************************/
		
		Map<String, Integer> ageByName2 = new HashMap<String, Integer>();
		Map<String, Integer> ageByName3 = new TreeMap<String, Integer>();
		
		ageByName2.put("Lizzie", 19);
		ageByName2.put("Casey", 18);
		ageByName2.put("Tara", 20);
		
		System.out.println(ageByName2);
		
		System.out.println(ageByName2.get("Casey"));//prints 18
		System.out.println(ageByName2.get("Lizzie"));//prints 19
		
		System.out.println(ageByName2.containsKey("Scott"));//false
		
		System.out.println(ageByName2.containsValue(20));//true
		//^ containsValue() is a relatively slow method
		//because it checks all values in the hashmap
		
		System.out.println(ageByName2.isEmpty());//false
		ageByName2.clear();
		System.out.println(ageByName2.isEmpty());//true
		
		
		
		//maps strings to integers
		Map<String, Integer> nameToAge = new HashMap<String, Integer>();
		
		System.out.println("/n/n/n/nEnter name: ");
		String name = scnr.nextLine();
		System.out.println("ENter age: ");
		int age = Integer.parseInt(scnr.nextLine());
		
		nameToAge.put(name, age);
		
		System.out.println("Enter name to query: ");
		String name2 = scnr.nextLine();
		System.out.print("The person named " + name2 + 
				" has an age of ");
		System.out.println(nameToAge.get(name2));
		
		
		
		
		
		//maps integers to strings
		Map<Integer, String> nameByAge = new HashMap<>();
		//^ params only need to be in declaration
		
		nameByAge.put(21, "Joan");
		nameByAge.put(34, "Anna");
		nameByAge.put(55, "Mike");
		nameByAge.put(42, "Daniel");
		nameByAge.put(34, "Aaron");//overwrites "Anna"
		//^for 34 slot in the hashmap
		
		System.out.println(nameByAge.get(21));//prints "Joan"
		
		
		Map<Integer, List<String>> namesByAge = new HashMap<>();
		
		List<String> newList = new ArrayList<>();
		newList.add("Joan");
		namesByAge.put(21, newList);
		newList = new ArrayList<>();
		newList.add("Anna");
		newList.add("Aaron");
		namesByAge.put(34, newList);
		newList = new ArrayList<>();
		newList.add("Mike");
		//etc etc etc
	}
}

*/
