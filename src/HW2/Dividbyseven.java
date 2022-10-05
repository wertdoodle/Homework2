package HW2;

import java.util.Random;

public class Dividbyseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int x = rand.nextInt(1000);
		
		if (x%7==0)
			System.out.println(x+" is divisble by 7");
		else
			System.out.println(x+" is not divisble by 7");
	}

}
