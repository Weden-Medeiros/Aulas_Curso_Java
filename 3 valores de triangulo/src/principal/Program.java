package principal;
import java.util.Scanner;
import entities.ValorTriangulo;
public class Program 
{

	public static void main(String[] args)
	{
          Scanner scanner = new Scanner(System.in);
          
		                System.out.println("Digite o comprimento do primeiro lado: ");
		                double lado1 = scanner.nextDouble();
		                System.out.println("Digite o comprimento do segundo lado: ");
		                double lado2 = scanner.nextDouble();
		                System.out.println("Digite o comprimento do terceiro lado: ");
		                double lado3 = scanner.nextDouble();

		                ValorTriangulo triangulo = new ValorTriangulo();
		                triangulo.lado1 = lado1;
		                triangulo.lado2 = lado2;
		                triangulo.lado3 = lado3;
		                triangulo.verificarTipoTriangulo();
		                scanner.close();
 }
}
		
			

