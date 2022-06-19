package HW2;

public class oddorevenreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int) (Math.random()*50);
		
		if(number % 2 == 0) {
			System.out.println(number + " The number is even.");
		}
	
		else {
			System.out.println(number + " The number is odd.");
		}

	}

}
