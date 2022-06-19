package HW2;

public class WordProb {
	public static void main(String[] args) {
        // Call method with
        // index as 0
        print("Happy Coding", 0);
}

// recursively prints
// each character of str
// on a new line
public static void print(String str, int index) {
        if (str.length() == index) {
                return;
        }

        System.out.println(str.charAt(index));
        print(str, ++index);
}
}