package HW2;
import java.util.Scanner;

public class MultiTable {

public static void main(String[] strings) {
Scanner in = new Scanner(System.in);
System.out.print("please enter a numbers:");
int number = in.nextInt();
for (int i = 0; i <= number; i++) {
System.out.println(number+" * "+i+" = "+number*i);

}
}
}