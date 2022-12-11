package talha;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("yiyecek ürünlerinde kdv hesaplamak için [1]araba ürünlerinde kdv hesaplamak için[2] konut ve arizilerde kdv hesaplamak için [3] giriniz");
		
		
		int secım=input.nextInt();
		
		
		
		
		if (secım==1) 
		{
			
			
			System.out.println("ürününüzün fiyatını giriniz");
			
			
			double a=input.nextDouble();
			
			
			double kdv1=a*0.01;
			
			
			System.out.println(kdv1+" tl ürününüzden alınan kdv fiyatıdır");
			
		}
			
			else if (secım==2) 
			
		{
				System.out.println("ürününüzün fiyatını giriniz");
				
				
				double b=input.nextDouble();
				
				
				double kdv2=b*0.18;
				
				
				System.out.println(kdv2 +" tl ürününüzden alınan kdv fiyatıdır");
				
		}
				
				
				else if (secım==3) 
				
				
		{
					System.out.println("ürününüzün fiyatını giriniz");
					
					
					double c=input.nextDouble();
					
					
					double kdv3=c*0.08;
					
					
					System.out.println(kdv3+" tl ürününüzden alınan kdv fiyatıdır");
					
		}
		
	}
		

	}


