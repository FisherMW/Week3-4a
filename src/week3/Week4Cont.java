package week3;

public class Week4Cont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//8	
		String firstName = "Jim";
	    String lastName = "jefferies";
	    String fullName = firstName + " " + lastName;
	    
	    System.out.println(fullName);
	
	//7
		double[] miles = new double[6]; {
			miles[0] = 23;
			miles[1] = 45;	
			miles[2] = 25;
			miles[3] = 92;
			miles[4] = 76;
			miles[5] = 53;
			
			}
			System.out.println(calculateAverage(miles));
			}
			public static double calculateAverage(double[] miles){
				double sum = 0;
				for (double mile : miles) {
					sum += mile;
				}
			return sum / miles.length;
			
			
			
	
	  
	}

}
