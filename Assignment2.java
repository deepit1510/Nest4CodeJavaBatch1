package nest4;

import java.util.Scanner;

public class Assignment2 {
	static Scanner input = new Scanner(System.in);
	static float heightConvertor(int hgt, int height) {
		float f_hgt = (float)  (hgt *12*2.54+ height*2.54);
		
		return (float) f_hgt;
		
	}
	
	static float weightConvertor(int weight) {
		float f_weight = (float) 2.3 *weight;
		
		return (float) f_weight;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the height feet part");
		int feet = input.nextInt();
		System.out.println("Enter the height inch part");
		int inch = input.nextInt();
		System.out.println("Enter the weight in kg");
		int weight = input.nextInt();
		float result = heightConvertor(feet,inch);
		float w_result = weightConvertor(weight);
		System.out.println("Result height in cm = "+result);
		System.out.println("Result weight in pound = "+w_result);
	}
}
