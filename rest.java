import java.util.*;

public class rest {
	
public static void main(String[] args){
Scanner input = new Scanner(System.in);
	System.out.println("price 1:");
	double p1 = input.nextDouble();
	System.out.println("price 2:");
	double p2 = input.nextDouble();
	System.out.println("price 3:");
	double p3 = input.nextDouble();
	System.out.println("tax %:");
	double tx = input.nextDouble();
	double t_p = p1+p2+p3;
	double fnl_amt = (tx* t_p)/100;
	System.out.println("Final Amount:"+fnl_amt);
}
}
