package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Entre com primeiro n�mero");
		num1 = leia.nextInt();
		
		System.out.println("Entre com segundo n�mero");
		num2 = leia.nextInt();
		
		System.out.println("Entre com terceiro n�mero");
		num3 = leia.nextInt();
		
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);
		}
		else if(num2 > num3){
			System.out.println("O maior n�mero �: " + num2);
		}
		else {
			System.out.println("O maior n�mero �: " + num3);
		}
		
		System.out.println();
		
		
		leia.close();
	}

}
