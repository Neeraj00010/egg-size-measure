/*
 * Name - Neeraj Kumar Bansal
 * Class - CST8116_301
 * Assessment - Exercise 08 Version 3
 */
import java.util.Scanner;   //Java API class scanner for user input

public class EggCounterVersion3 {
	private static int SIZE = 8;    //static value of egg sizes
	private int eggCounts[] = new int[SIZE];    //array to check size
	private String eggSizeName[] = {"too small", "peewee", "small", "medium", "large", "extra-large", "jumbo", "too large"};
    private static int TOO_SMALL = 0;
    private static int PEEWEE = 1;
    private static int SMALL = 2;
    private static int MEDIUM = 3;
    private static int LARGE = 4;
    private static int EXTRA_LARGE = 5;
    private static int JUMBO = 6;
    private static int TOO_LARGE = 7;
	private Scanner keyboard = new Scanner(System.in);      //method for user input
	
	 public void enterEggs() {          //overloaded constructor for user inputs
	    	String shouldContinue;
	    	int weight;
	    	int size;
	    	do {
	    		System.out.println("Enter the egg weight: ");
	    		weight = keyboard.nextInt();
				size = sizeEgg(weight);
				keyboard.nextLine();        //flush extra value from program
	    		eggCounts[size]++;
	    		System.out.println("Enter another egg weight? (Y/N)");
	    		shouldContinue = keyboard.nextLine();
	    	}while(shouldContinue.equals("Y") || shouldContinue.equals("y"));
	    }
	    
	    public void printReport() {      //another constructor for report
	    	int index;
	    	int count;
	    	for(index = 0; index <= (SIZE-1);){     
	    		for(count = 1; count <= eggCounts[index]; count++) {  //embedded loops for printing stars
	    		System.out.print("*");
	    	}
	    	System.out.println(eggSizeName[index]+":"+eggCounts[index]);
    		index = index + 1;           //post increment operator
	    	}
	    }
	    public int sizeEgg(int weight) {      //sizeEgg constructor with parameter
	    		int size;
	    		if (weight < 15) {      //if statement boolean expression for condition 1
	    			  size = TOO_SMALL;	
	    			} else if (weight < 18) {  //else if for more conditions
	    				size = PEEWEE;
	    			} else if (weight < 21) {
	    				size = SMALL;
	    			} else if (weight < 24) {
	    				size = MEDIUM;
	    			} else if (weight < 27) {
	    				size = LARGE;
	    			} else if (weight < 30) {
	    				size = EXTRA_LARGE;
	    			} else if (weight < 33) { 
	    				size = JUMBO;
	    				}
	    			else {           //else statement if above all conditions false
						size = TOO_LARGE;
	    			}
	    		return size;
	    	}
}
