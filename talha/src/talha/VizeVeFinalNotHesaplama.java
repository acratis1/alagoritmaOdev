package talha;

import java.util.Scanner;

public class VizeVeFinalNotHesaplama {

	public static void main(String[] args) {
		
		
		Scanner giris= new Scanner(System.in);
		
		
		
		System.out.println("Vize notunuzu giriniz ");
		
		
		double a=giris.nextDouble();
		
		
		if (a>100)  
		
			
				System.out.println("Yanlış not girdiniz,lütfen geçerli bir not giriniz");

		else {
			
			
			System.out.println("Final notunuzu giriniz"); 
			
			
			double b=giris.nextDouble(); 

		
			
			 if (b<101) {
				 
				 
				double not = (a*0.4)+(b*0.6); 
				
								
				System.out.println(not);}
				
			
			else 
				
				System.out.println("Yanlış not girdiniz,lütfen geçerli bir not giriniz");
			
		
		
		
		
		

		
		

	
		}
	}

	}
