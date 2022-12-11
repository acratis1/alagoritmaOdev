package talha;

import java.util.Scanner;


public class DiskirimantHesaplama {
	
	public static void main(String []args) {
	
	
	System.out.println("ax²+bx+c debkleminizin için a,b,c yi yazınız ");
	
	
	Scanner gırıs =new Scanner(System.in); 
	
	
	System.out.println("a ?");
	
	
	double a=gırıs.nextDouble();
	
	
System.out.println("b ?");


	
	double b=gırıs.nextDouble();
	
	
System.out.println("c ?");

	

	double c=gırıs.nextDouble();
	
	
	
	double d=(b*b)-(4*a*c);
	
	
	
	System.out.println(d+" denkleminizin diskiramantıdır.");
}

}
