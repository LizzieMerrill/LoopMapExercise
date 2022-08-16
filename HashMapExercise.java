class HashMapExercise{
  public static void main(String[] args){
    
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
