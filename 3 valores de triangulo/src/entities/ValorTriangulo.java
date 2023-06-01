package entities;

public class ValorTriangulo 
{
    public double lado1;
    public double lado2;
    public double lado3;

    public void verificarTipoTriangulo()
    {
        if (lado1 == lado2 && lado2 == lado3) 
	        {
	            System.out.println("O tri�ngulo � equil�tero.");
	        } 
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) 
	        {
	            System.out.println("O tri�ngulo � is�sceles.");
	        } 
        else 
	        {
	            System.out.println("O tri�ngulo � escaleno.");
	        }
    }
}