package assignment1;

import java.util.Scanner;

public class TypeCastings {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		    int floatToInt = (int)sc.nextFloat();
		    System.out.println(floatToInt);
		    
		    double intToDouble =sc.nextInt();
		    System.out.println(intToDouble);
		    
		    float longToFloat=(float)sc.nextLong();
		    System.out.println(longToFloat);
		    
	        int doubleToInt=(int)sc.nextDouble();
	        System.out.println(doubleToInt);
	        
	        float intToFloat=sc.nextInt();
	        System.out.println(intToFloat);
	        
	        double longToDouble=(double)sc.nextLong();
	        System.out.println(longToDouble);
	        
		 
	}

}
