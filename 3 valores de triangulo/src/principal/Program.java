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
		
									////// Parte do Professor ///////	
						/*public static void main(String[] args) 
						{
						
							Scanner sc = new Scanner (system.in);
							
							Triangulo triangulo = new Triangulo();
							
							System.out.println("Entre com o valor do x:");
							int x = sc.nextInt();
							System.out.println("Entre com o valor do y:");
							int y = sc.nextInt();
							System.out.println("Entre com o valor do z:");
							int z = sc.nextInt();
							
							triangulo.retornatipoTriangulo(x, y, z);
							System.out.println(triangulo.tipoTriangulo);
							sc.close();
						}
}*/