package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Entre com primeiro número");
		num1 = leia.nextInt();
		
		System.out.println("Entre com segundo número");
		num2 = leia.nextInt();
		
		System.out.println("Entre com terceiro número");
		num3 = leia.nextInt();
		
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);
		}
		else if(num2 > num3){
			System.out.println("O maior número é: " + num2);
		}
		else {
			System.out.println("O maior número é: " + num3);
		}
		
		System.out.println();
		
		
		leia.close();
	}

}
