package talha;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Lütfen 2 sayı giriniz");
		
		
		double a=input.nextDouble();
		
		
		double b=input.nextDouble();
		
		
		System.out.println("lütfen toplama işlemi için [1]'i çıkarma için [2]'yi çarpma için [3] bölme için [4]'ü giriniz");
		
		
		double secım =input.nextDouble();
		
		
		if(secım==1) {
			
			
			double ç=a+b;
			
			
		System.out.println(ç);}
		
		
		else if(secım==2) {
			
			
			double v=a-b;
			
			
		System.out.println(v);}
		
		
		else if(secım==3) {
			
			
			double q=a*b;
			
			
		System.out.println(q);}
		
		
		else if(secım==4) {
			
			
			double p=a/b;
			
			
		System.out.println(p);}
		
					
			}
		
		
	
		
		
		


	}


