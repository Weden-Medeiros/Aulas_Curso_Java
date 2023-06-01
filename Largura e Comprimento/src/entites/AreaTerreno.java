package entites;

public class AreaTerreno 
{

	public double area;

    public void retornaArea(double largura, double comprimento) 
    {
        area = largura * comprimento;
    }
}