package talha;

import java.util.Scanner;

public class DaırenınAlanınıVeCevresınıHesaplama {

	public static void main(String[] args) {
		
		
		final double PI =3.14;
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Dairenin alanını ögrenmek için (1)'e çevresini öğrenmek icin (2)'ye basınız:");
		
		
		int secim=input.nextInt();
		
		
		System.out.println("bir yarıçap değeri giriniz");
		
		
		double r =input.nextDouble();
		
		
		if(secim==2)
			
		{
			
			double cevre=2*PI*r;
			
			
			System.out.println(r+" yarıçalı dairenin çevresi:"+cevre);
			
		}
		else if(secim==1)
			
			
		{
			
			double alan=PI*r*r;
			
			
			System.out.println(r+" yarıçalı dairenin alanı:"+alan);
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
