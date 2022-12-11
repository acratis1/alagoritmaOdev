package talha;

import java.util.Scanner;

public class BüyükKüçük {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("birinci sayınızı giriniz");
		
		
		double a = input.nextDouble();
		
		
		System.out.println("ikinci sayısınızı giriniz");
		
		
	
		double b = input.nextDouble();
		
		
	
		if(a>b)
			
			
			System.out.println("BİRİNCİ SAYINIZ İKİNCİ SAYINIZDAN BÜYÜKTÜR");
		
		
		else if(b>a)
			
			
			System.out.println("İKİNCİ SAYINIZ BİRİNCİ SAYINIZDAN BÜYÜKTÜR");
		
		else 
			
			System.out.println("İKİ SAYINIZ EŞŞİTİR");
		
	}

}
