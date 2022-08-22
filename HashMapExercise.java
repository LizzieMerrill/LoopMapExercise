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
		
	  System.out.print("Hello valued customer! Would you like to browse our current selection of cars, or would you like to request a new car be added to our dealership? (Answer 'b' to browse, 'a' to add new car, 'l' to list your car options or 'q' to quit): ");
			   
	  char customerChoice = scnr.next();
	  
	  switch(customerChoice){
		  case b:
		  	browseCars();
		  break;
		  case a:
			System.out.print("Real quick, can we get the model of the car you want to add just so we can check if we already have it? ");
			  String model2 = scnr.nextLine();
			if (findModel(model2) == false){
				addCar();
			}
		  	else{
				String make2 = makeByModel.get(model2);
				System.out.println("Oh, we already have that car in stock!");
				System.out.printf("So you're looking for a %s? Our %s selection is right over here...\n", model2, make2);
				System.out.printf("We will have a sales rep with you shortly to discuss the details of purchasing a %s %s. Thank you for shopping at our dealership, have a great day!", make2, model2);
			}
			
		  break;
		  case l:
			  listSelection();
			  System.out.println("Those are all of the cars we have at the dealership right now.\n\n");
			  introDialogue();
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
		
	System.out.println("Do you have a specific car model in mind, or would you like to see a list of what cars are in stock right now? (Answer 'y' is you have a model in mind, 'l' if you would like to list your options, 'a' to add a car to the dealership, or 'q' to quit): ");
				   
		char customerChoice2 = scnr.next();
				   
		switch(customerChoice2){
		  case y:
		  	System.out.println("What model is the car you're looking for? ");
			String carModel = scnr.nextLine();
			if(findModel(carModel) == true){
				String carMake = makeByModel.get(carModel);
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...\n", carModel, carMake);
				System.out.printf("We will have a sales rep with you shortly to discuss the details of purchasing a %s %s. Thank you for shopping at our dealership, have a great day!", carMake, carModel);
			}
			else{
			    System.out.printf("We're terribly sorry, but we do not have %s model cars in stock right now. Would you like to add them to our dealership? (Answer 'a' to add, 'b' to browse again, 'l' to list all available cars, or 'q' to quit): ", carModel);
			    char customerChoice3 = scnr.next();
			    switch(customerChoice3){
				    case a:
					    String model3 = addCar();
					    String make3 = makeByModel.get(model3);
					    System.out.println("There, we have added your wanted car to our dealership. Our %s selection is right over here...\n", make3);
					    System.out.printf("We will have a sales rep with you shortly to discuss the details of purchasing a %s %s. Thank you for shopping at our dealership, have a great day!", make3, model3); 
				    break;
				    case b:
					    browseCars();
				    break;
				    case l:
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
			    }//end switch case
			}//end else bracket
		  break;
		  case l:
		  	listSelection();
			System.out.print("Now, knowing this, ");
			browseCars();
		  break;
		  case a:
			String model3 = addCar();
			String make3 = makeByModel.get(model3);
			System.out.println("There, we have added your wanted car to our dealership. Our %s selection is right over here...\n", make3);
			System.out.printf("We will have a sales rep with you shortly to discuss the details of purchasing a %s %s. Thank you for shopping at our dealership, have a great day!", make3, model3); 
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
	
	//finds out if model is at dealership
	public static boolean findModel(String model){
		int isInHashMap = 0;
		
		for(String key: makeByModel.keySet()) {
		    if(model.equalsIgnoreCase(key) == true){
		    	isInHashMap++;
		    }
		}
		if(isInHashMap == 0){
			return false;
		}
		else{
			return true;
		}
	}//end of findModel method
						  
	public static String addCar(){
		System.out.print("Enter the make of the car you have in mind to add to our dealership: ");
		String wantedMake = scnr.nextLine();
		System.out.print("Enter the model of the car you have in mind to add to our dealership: ");
		String wantedModel = scnr.nextLine();
		makeByModel.put(wantedModel, wantedMake);
		
		return wantedModel;
	}//end of addCar method
			   
	public static void listSelection(){
	     System.out.println("Here is a list of all the cars we have for sale today: \n");
	     //prints all car makes and models available at the dealership
	     for(Map.Entry<String, String> entry: makeByModel.entrySet()) {
		String key = entry.getKey();
		String value = entry.getValue();
		System.out.println(value + " " + key);
	     }
	     System.out.println("\n\n\n");
	}//end of listSelection method
  }//end main method
}//end of class
