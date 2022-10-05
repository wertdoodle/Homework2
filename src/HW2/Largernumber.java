package HW2;

import java.util.Random;

public class Largernumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		  
        // Generate random integers in range 0 to 999
        int x = rand.nextInt(1000);
        int y = rand.nextInt(1000);
  
        // Print random integers
        if (x>y)
        System.out.println(x);
        else
        System.out.println(y);
		
	}

}
