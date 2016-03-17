package loopwhile.core;

import java.util.Random;

public class ThirtyWhile {
	
	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: While Loops
	 *	Project Description: a.	The Loop project runs 
	 *  30 while loops that display different number combinations 
	 *  and use different math types to count up, count down, 
	 *  multiply, or divide. 
	 * 
	 **/
	
	public static void main(String args[]){
		
		int counter = 0;
		
		Inclusive0to9:
		while(counter <= 9){		// <= allows for the 9 to still be counted
			counter++;
			System.out.println("0 to 9 (inclusive): " + counter);	// Prints the string "0 to 9 (inclusive): " then prints the counter Value	
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 0;
		Exclusive0to9:
		while(counter < 9){ 		// < stops the 9 from being counted 
			counter++;
			System.out.println("0 to 9 (exclusive): " + counter);	// Prints the string "0 to 9 (exclusive): " then prints the counter Value
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 10;
		CountUp10to20:
		while(counter <= 20){ 	// <= counts the 20 so it will be displayed
			counter++;
			System.out.println("10 to 20: " + counter);		// Prints the string "10 to 20: " then prints the counter Value
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = -10;
		CountUpfromNeg10to10:	
		while(counter <= 10){	// <= counts the 10 so the 10 will be displayed
			counter++;
			System.out.println("-10 to 10: " + counter);
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 28;
		CountUpFrom28to58:	
		while(counter <= 58){	// <= counts the 58 so 58 will be displayed
			counter++;
			System.out.println("28 to 58: " + counter);
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 0;
		CountUpFrom0to20by2:	
		while(counter <= 20){	// <= counts the 20 so 20 will be displayed
			counter += 2;
			System.out.println("0 to 20 by 2's: " + counter);
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 0;
		CountUpFrom0to20by4:	
		while(counter <= 20){	// <= counts the 20 so 20 will be displayed
			counter += 4;
			System.out.println("0 to 20 by 4's: " + counter);
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 0;
		CountUpFrom0to20by5:	
		while(counter <= 20){	// <= counts the 20 so 20 will be displayed
			counter += 5;
			System.out.println("0 to 20 by 5's: " + counter);
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 0; 
		CountUpFrom0to20by3:	
		while(counter <= 20){	// <= counts the 20 so 20 will be displayed
			counter += 3;
			System.out.println("0 to 20 by 3's: " + counter);
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 100;
		CountUpFrom100to200by8:	
		while(counter <= 200){	// <= counts the 200 so 200 will be displayed
			counter += 8;
			System.out.println("100 to 200 by 8's: " + counter);
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		Random ran = new Random();	// Main Random Call
		int x_rand_50_150 = ran.nextInt(100) + 50;	// creates a random number from 50 to 150
		int rand_count = ran.nextInt(10) + 10;		// Creates a random value from 10 to 20 to count up by
		
		System.out.println("The max value is: " + x_rand_50_150);	// Prints the random x value
		System.out.println("This loop will count up by: " + rand_count);	// prints the random count amount
		
		counter = 0; 
		CountUpFrom0toRandomByRandom:
		while(counter <= x_rand_50_150){	// <= counts the x_rand_50_150 so it will be displayed
			counter += rand_count;
			System.out.println("0 to 50-150 by 10 - 20: " + counter);	// prints the counter value
		}
	
		System.out.println("");      // Space For Visual Appearance
		
		int counter_rand = ran.nextInt(100);	// Creates a random integer that acts as a base for all other random
		int rand_x = ran.nextInt(counter_rand);	// creates a random value from 0 to the Counter_rand value
		int rand_y = ran.nextInt(counter_rand) + rand_x; //Creates a random value from 0 to the Counter_rand + the value of rand_x so we know it is larger
		int count_add = ran.nextInt(((rand_y - rand_x) / 10));	// Gets the difference between x and y and divides that by 10 to get the amount to count by.
		
		System.out.println("The starting value of counter is: " + rand_x);	//prints the value of rand_x
		System.out.println("The ending value of counter is: " + rand_y);	//prints the value of rand_y
		System.out.println("This loop will count up by: " + count_add);		//prints the value of Count_add
		
		if(!(count_add >= 1)){
			count_add += 1;
		}
		
		counter = rand_x;
		CountUpFromRandomtoRandomByRandom:
		while(counter <= rand_y){		// For Loop while rand_x is larger or equal to rand_y
			counter += count_add;
			System.out.println("x to y by random: " + counter);		//prints the value of counter
		}
	
		System.out.println("");      // Space For Visual Appearance
		
		counter = 10;
		CountDownfrom10to0Inclusive:	
		while(counter >= 0){		// 10 to 0 Inclusive
			System.out.println("10 to 0 (inclusive): " + counter);	//prints the value of counter
			counter--;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 10;
		CountDownfrom10to0Exclusive:
		while(counter > 0){		// 10 to 0 Exclusive
			System.out.println("10 to 0 (exclusive): " + counter); //prints the value of counter
			counter--;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 20;
		CountDownfrom20to10By1:	
		while(counter >= 10){	// 20 to 10 By 1
			System.out.println("20 to 10: " + counter); //prints the value of counter
			counter--;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 10;
		CountDownfrom10toNeg10:
		while(counter >= -10){	// 10 to -10 By 1
			System.out.println("10 to -10: " + counter); //prints the value of counter
			counter--;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = -88;
 		CountUpfromNeg88toNeg58:	
		while(counter <= -58){		// -88 to -58 By 1
			System.out.println("-88 to -58: " + counter); //prints the value of counter
			counter++;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 20;
		CountDownfrom20to0By2:
		while(counter >= 0){		// 20 to 0 By 2
			System.out.println("20 to 0 (by 2's): " + counter); //prints the value of counter
			counter -= 2;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 20;
		CountDownfrom20to0by4:
		while(counter >= 0){		// 20 to 0 By 4
			System.out.println("20 to 0 (by 4's): " + counter); //prints the value of counter
			counter -= 4;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 20;
		CountDownfrom20to0by5:
		while(counter >= 0){		// 20 to 0 By 5		
			System.out.println("20 to 0 (by 5's): " + counter); //prints the value of counter
			counter -= 5;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		counter = 20; 
		CountDownfrom20to0by3:
		while(counter >= 0){		// 20 to 0 By 3
			System.out.println("20 to 0 (by 3's): " + counter); //prints the value of counter
			counter -= 3;
		}
		 
		System.out.println("");      // Space For Visual Appearance
		
		counter = 200;
		CountDownfrom20to0by8:
		while(counter >= 100){		// 200 to 100 By 8
			System.out.println("200 to 100 (by 8's): " + counter); //prints the value of counter
			counter -= 8;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		int counter_rand_1 = ran.nextInt(100);
		int rand_x_1 = ran.nextInt(counter_rand_1);
		int count_add_1 = ran.nextInt(counter_rand_1 * 2);
		
		System.out.println("The starting value of counter is: " + rand_x);
		System.out.println("The ending value of counter is: " + rand_y);
		System.out.println("This loop will down up by: " + count_add);
		
		counter = rand_x_1;
		CountDownFromRandomToRandomByRandom:
		while(counter >= 0){
			System.out.println("x to y by random: " + counter); //prints the value of counter
			counter -= count_add_1;
		}
		
		
		System.out.println("");      // Space For Visual Appearance
		
		int y_12 = ran.nextInt(100);
		int x_12 = ran.nextInt(100) + (y_12);
		int diff = ((y_12 - x_12) / 10) * -1;
		
		System.out.println("The starting value of counter is: " + x_12);
		System.out.println("The ending value of counter is: " + y_12);
		System.out.println("This loop will count down by: " + diff);
		
		counter = x_12; 
		CountDownFromRandomToNegRandomByRandom:
		while(counter >= (y_12)){
			counter -= diff;
			System.out.println( "x and y (by random value): " + counter); //prints the value of counter
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		int display_num = 2;		// Number to be displayed
		counter = 10;
		Display10EvenNumbers:
		while(counter > 0){
			System.out.println("10 even numbers: " + display_num);	
			display_num += 2;		// Adds 2 to the number to be displayed
			counter--;
		}
		
		System.out.println("");      // Space For Visual Appearance
		
		int display_num_odd = 1;	// Number to be displayed
		counter = 10; 
		Display10OddNumbers:
		while(counter > 0){
			System.out.println("10 odd numbers: " + display_num_odd);
			display_num_odd += 2;	// Adds 2 to the number to be displayed
			counter--;
		}

		System.out.println("");      // Space For Visual Appearance
				
		int display_num_ten = 0;	// Number to be displayed
		counter = 0; 
		CountingUpBy10:
		while(counter <= 100){
			System.out.println("Counting By 10 to 100: " + display_num_ten);
			display_num_ten += 10; 	// Adds 10 to the number to be displayed
			counter += 10;			
		}
		
		System.out.println("");      // Space For Visual Appearance
			
		counter = 0;
		CountingBy5To100:
		while(counter <= 100){
			System.out.println("Counting By 5 to 100: " + counter); //prints the value of counter
			counter += 5;
		}
					
		System.out.println("");      // Space For Visual Appearance
		
		int display_num_doub = 1;	// Number to be displayed
		counter = 0; 
		DoubleTheNumber10x:
		while(counter <= 10){
			System.out.println("Double 10 Times: " + display_num_doub);
			display_num_doub *= 2;	// Multiply the number by 2 to the number to be displayed
			counter++;
		}
						
		System.out.println("");      // Space For Visual Appearance
		int display_num_half = 1024;	// Number to be displayed
		counter = 0; 
		HalfTheNumber10x:
		while(counter <= 10){
			System.out.println("Half The Number Each Time: " + display_num_half);
			display_num_half /= 2;		// Divides The Number to be displayed by 2
			counter++;		
		}		
	}
}
