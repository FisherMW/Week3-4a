package week3;

import java.lang.reflect.Array;

class week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 int[] ages = {3, 9, 23, 64, 2, 8, 28};
 
 int lengthOfAge = ages.length;
 int difference = Math.abs(ages[lengthOfAge - lengthOfAge] - ages[lengthOfAge - 1]);
 
 
		System.out.println("Difference of first and last element in ages [] = " + difference);
		
int[] newAges = new int[ages.length];		
		
		System.arraycopy(ages, 0, newAges, 0, lengthOfAge);
		
		lengthOfAge= newAges.length;
		newAges[lengthOfAge - 1] = 43;
		difference = Math.abs(newAges[lengthOfAge - lengthOfAge] - newAges[lengthOfAge - 1]);
		
		System.out.println("Difference of first and last element in newAges[] = " + difference);
		
int sum = 0;
for (int i = 0; i < newAges.length; i++) {
	   sum += newAges[i];
}	   
double average = sum / lengthOfAge;

    System.out.println("The Average age in newAges[] = " + average );

	//2
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	sum = 0;
	for (int i = 0; i < names.length; i++) {
		   sum += names[i].length();
	}
	average = sum / names.length;
	System.out.println("The average number of letters per name in names[] = " + average );
	
	String allNames = "";
	for (int i = 0; i < names.length; i++) {
		allNames += names[i] + " ";
	}
	System.out.println(allNames);

	//3
	// Use array[arr.length] to access the last element of an array
	//4
	// Use array[0] to access the first element of an array
	
	//5
	int[] nameLengths = new int[names.length];
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		}
	
	//6
	
	sum = 0;
	for(int i = 0; i < nameLengths.length; i++) {
	       sum += nameLengths[i];
	}
	System.out.println("The sum of all lengths in nameLengths[] = " + sum);}
	{}
	


	
	


	



}
	
	
	

	
	









    
     
     
     
   
          

	
	

	
	
	
	
	
	
	

		




	
	
	
    

				
		
	


