package talha;

import java.util.Scanner;

public class UcgenınAlanınınıHesaplama {

	public static void main(String[] args) {
		
		
		System.out.println("yüksekliği h olan 2 kenarı a ve b olan üçgeninizin sırasıyla ölçülerni giriniz ");
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("h?");
		
		
		double h=input.nextDouble();
		
		
		System.out.println("a?");
		
		
		double a =input.nextDouble();
		
		
		System.out.println("b?");
		
		
		double b =input.nextDouble();
		
		
		double alan=a*b*h;
		
		
		System.out.println("Girdiğinizin bilgili üçgeninizin alanı : " + alan);
		
		
		


	}

}
