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
    	   String myUnit; int myValue; double myNewValue; String newUnit;
            
             System.out.println("Enter a value to convert: ");
	   	      myValue = myObj.nextInt();
            System.out.println("Enter the current unit of measure: ");
	   	       myUnit = myObj.next();	    
        
     if (myUnit == "km") {

	   	  /* convert myValue to miles (mi) and 
	   	   store the new value in myNewValue */

	   	    myNewValue = myValue * 0.62;
	   	    newUnit = "mi";
            //System.out.println(myNewValue + newUnit);
	   	    System.out.println(myValue + myUnit +  " is equal to " + myNewValue  + newUnit);

	   }else if (myUnit == "cm") {

	   	 myNewValue = myValue * 0.39;
	   	 newUnit = "in";
	   	 System.out.println(myValue + myUnit +  " is equal to " + myNewValue  + newUnit);


	   }else if (myUnit == "C") {

	   	myNewValue = (myValue * 9/5) + 32;
	   	newUnit = "F";
	   	System.out.println(myValue + myUnit +  " is equal to " + myNewValue  + newUnit);

	   }else if (myUnit == "g") {

	   	myNewValue = myValue * 0.04;
	   	newUnit = "oz";
	   	System.out.println(myValue + myUnit +  " is equal to " + myNewValue  + newUnit);

	   }else if (myUnit == "kg") {

	   	myNewValue = myValue * 2.2; 
	   	newUnit = "lb";
	   	System.out.println(myValue + myUnit +  " is equal to " + myNewValue  + newUnit);

	   }else if (myUnit == "L") {

	   	myNewValue = myValue * 4.17;
	   	newUnit = "cups";
	   	System.out.println(myValue + myUnit +  " is equal to " + myNewValue  + newUnit);

	   }else {
  
        System.out.println("Enter correct unit");
	   }

        
	  	
    }

}