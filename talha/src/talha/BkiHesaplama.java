package talha;

import java.util.Scanner;

public class BkiHesaplama {

	public static void main(String[] args) {
		
		
        Scanner input= new Scanner(System.in);
        
		
		System.out.println("boyunuzu giriniz(metre)");
		
		
		double a = input.nextDouble();
		
		
		System.out.println("kilonuzu giriniz(kilagram)");
		
		
		double b=input.nextDouble();
		
		
		double bki= b / (a*a) ;
		
		
		if (bki>40)
			
			
			System.out.println("OBEZ");
		
		
		else if(bki>30)
			
			
			System.out.println("FAZLA KİLOLU");
		
		
		else if (bki<30 && bki>25)
			
			
			System.out.println("KİLOLU");
		
		
		else 
			
			
			System.out.println("ZAYIF");



	}

}
