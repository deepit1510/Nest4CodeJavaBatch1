import java.util.Scanner;

public class Assignment3 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in1 = scan.next();
		String in2 = scan.next();
		int length1 = in1.length();
		int length2 = in2.length();
		String str2last = in2.substring(length2-2, length2);
		String str1last = in1.substring(length1-2, length1);
		String str2first = in2.substring(0, 2);
		String str1first = in1.substring(0, 2);

		String result1 = str2last + in1.substring(2, length1-2) 
		+str2first;
		String result2 = str1last + in2.substring(2, length1-2) 
		+str1first;
		System.out.println(result1);
		System.out.println(result2);
	}

}
