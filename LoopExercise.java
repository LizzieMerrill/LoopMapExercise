import java.util.ArrayList;

class LoopExercise{
  public static void main(String[] args){
   
    //Declaring arraylist and setting up prompting for loop
    ArrayList<Integer> arrayListOfNums = new ArrayList<Integer>();
    int numOfNumbersCounter = 0;
    
    //prompts user for numbers, displays progress and adds numbers to arraylist
    for(int i = 0; i < 5; ++i){
      System.out.printf("Enter one of five numbers (Progress: %d out of 5 numbers entered): ", numOfNumbersCounter);
      int numEntered = scnr.nextInt();
      arrayListOfNums.add(numEntered);//adds number entered to arrayListOfNums
      numOfNumbersCounter++;
    }
    
    
    //declaring variables for math operations
    int sum = 0;
    int product = 1;//set to one to prevent multiplication by 0 ruining the calculations
    int smallestNum = arrayListOfNums.get(0);//sets smallest num to first num to prevent calculation mistakes if it was initialized to 0 and all nums entered were negative
    int largestNum = arrayListOfNums.get(0);//sets largest num to first num to prevent calculation errors
    
    //giant for loop to complete a sum, product, min search and max search for all numbers in the ArrayList
    for(int i = 0; i < arrayListOfNums.size(); ++i){
      
      //appends sum and product values with current index value
      sum += arrayListOfNums.get(i);
      product *= arrayListOfNums.get(i);
      
      if(i != 0){//no need to evaluate first element, as it's already set to both the min and max values
        if(arrayListOfNums.get(i) > largestNum){
          largestNum = arrayListOfNums.get(i);
        }
        else if(arrayListOfNums.get(i) < smallestNum){
          smallestNum = arrayListOfNums.get(i);
        }
        else{}//do nothing
      }//end of nested if statement
    }//end of for loop
    
    System.out.printf("The five numbers you entered added up to %d and multiplied out to %d! The smallest number was %d and the largest number was %d! Thanks for using my program! :)", sum, product, smallestNum, largestNum);
    
    
  }//end of main
}//end of class
