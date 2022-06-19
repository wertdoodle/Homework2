package HW2;

public class strtoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "24";
        try{
            int number = Integer.parseInt(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
	}

}
