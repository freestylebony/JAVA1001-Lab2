import java.util.Scanner;
public class ArrayTools {

	  public static void main(String[] args) {
		
		//declaring a hard-coded array of data-type integer with variable name arrNum
		int arrNum[] = {44, 78, 45, 77, 44, 98, 67, 68, 91, 54};
        //calling arrayAvg method
		float avgResult = arrayAvg(arrNum);
		System.out.println("The average is : " +avgResult);
		
		//collecting user input to search for number in array
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter a value to search for: ");
		int numToCheck =Input.nextInt();

		//assign the arrayContains method to a variable and prints out the result
		boolean isNumInArr = arrayContains(arrNum, numToCheck);
		System.out.println("Does the array contain " + numToCheck + "? :" + isNumInArr);
		
	}

       // method for average of Array values
	  public static float arrayAvg(int[]arrNum) {
		 
		 int sum = 0;
		 int avg = 0;
		 for (int index = 0; index < arrNum.length; index++) {
			 
			 sum +=arrNum[index];
		 }
		 avg = sum/arrNum.length;
		 return avg;
	 }
	 // method for checking if a particular number/value is in the array
	  public static boolean arrayContains(int[]arrNum, int numToCheck) {
		 boolean test = false;
		 for(int element: arrNum) {
			 if(element == numToCheck) {
				 test = true;
				 break;
			 }
		 }return true;
	 }
		 
	 
	  
}
