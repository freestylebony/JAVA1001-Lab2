/*
  Assumption is based on one way conversion of six units:

    1. from km to mi
    2. from cm to in
    3. from  C to F
    4. g to oz
    5. kg to lb
    6. L to cups
    Name : Hafees Falana
    Student ID: A00240043

   */

import java.util.Scanner;  // Import the Scanner class

public class Convert{
	
    
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	   String oldUnit; int oldValue; double newValue; String newUnit;  //Initialize variables
            
             System.out.println("Enter a value to convert: ");
	   	      oldValue = myObj.nextInt();
            System.out.println("Enter the current unit of measure: ");
	   	       oldUnit = myObj.next();	    
        
     if (oldUnit.equalsIgnoreCase("km")) {

	   	  /* convert oldValue to miles (mi) and 
	   	   store the new value in newValue */

	   	    newValue = oldValue * 0.62;
	   	    newUnit = "mi";
	   	    System.out.println(oldValue + oldUnit +  " is equal to " + newValue  + newUnit);

	   }else if (oldUnit.equalsIgnoreCase("cm")) {

	   	 newValue = oldValue * 0.39;
	   	 newUnit = "in";
	   	 System.out.println(oldValue + oldUnit +  " is equal to " + newValue  + newUnit);


	   }else if (oldUnit.equalsIgnoreCase("C")) {

	   	newValue = (oldValue * 9/5) + 32;
	   	newUnit = "F";
	   	System.out.println(oldValue + oldUnit +  " is equal to " + newValue  + newUnit);

	   }else if (oldUnit.equalsIgnoreCase("g")){

	   	newValue = oldValue * 0.04;
	   	newUnit = "oz";
	   	System.out.println(oldValue + oldUnit +  " is equal to " + newValue  + newUnit);

	   }else if (oldUnit.equalsIgnoreCase("kg")) {

	   	newValue = oldValue * 2.2; 
	   	newUnit = "lb";
	   	System.out.println(oldValue + oldUnit +  " is equal to " + newValue  + newUnit);

	   }else if (oldUnit.equalsIgnoreCase("L")) {

	   	newValue = oldValue * 4.17;
	   	newUnit = "cups";
	   	System.out.println(oldValue + oldUnit +  " is equal to " + newValue  + newUnit);

	   }else {
  
        System.out.println("Enter correct unit");
	   }

        
	  	
    }

}