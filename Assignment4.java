package nest4;

import java.util.Scanner;

public class Assignment4 {
	static Scanner input = new Scanner(System.in);
		static int a;
		static int even;
		static int odd;
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int number = input.nextInt();
		while (number!=0) {
			a = number%10;
			if(a%2 ==0){
				even +=1;
			}
			else {
				odd +=1;
			}
			number = number/10;
		}
		System.out.println("Number of Even = "+even);
		System.out.println("Number of Odd ="+odd);
	}
}
