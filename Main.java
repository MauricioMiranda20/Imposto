package imposto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite o valor do Imposto:");
		double a = sc.nextDouble();
		double res;
				 
		if(a>=0 && a<=2000) {
			System.out.println("Isento");
		}
		if(a>2000 && a<=3000) {
			res = (a-2000)*0.8;
			System.out.printf("8 sobre %.2f o valor %.2f\n",res,a);
		}
		if(a>3000 && a <= 4500) {
			res = (a-3000)*0.18+1000*0.08;
			System.out.printf("18 sobre %.2.f o valor %.2f\n",res,a);		
		}
		if(a>4500) {
			res = (a-4500)*0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("28 sobre %2.f o valor %.2f\n",res,a);
		}
		sc.close();
	}

}
