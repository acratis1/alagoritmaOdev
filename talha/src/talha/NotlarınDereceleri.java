package talha;

import java.util.Scanner;

public class NotlarınDereceleri
{

	public static void main(String[] args) 
	
	
	{
		Scanner giris=new Scanner(System.in);
		
		
		System.out.println("bir not giriniz ");
		
		
		double not=giris.nextDouble();
		
		
		if(not>89 && not<101) 
			
		
		System.out.println("A");
		
		
		else  if (not>79 && not<91)
			
		
		
		System.out.println("B");
		
		
		
		else if(not>69 && not<81)
			
			
		
		System.out.println("C");
		
		
		
		else if(not>59 && not<71)
			
			
		
		System.out.println("D");
		
		
		
		else if(not>49 && not<61)
		
			
			
		System.out.println("E");
		
		
		
		else if(not<50 && not>0) 
			
			
		
		System.out.println("F");
		
		
		else
			
			
			System.out.println("Geçersiz not girdiniz,lütfen geçerli bir not giriniz");
		
	
	}


}
		
			
		
		
		
		
		

	


