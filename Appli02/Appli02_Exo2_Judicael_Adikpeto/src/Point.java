
public class Point {

	private char nom_point;
	private double x ;
	private static int nbreInstancesBis = 0;
	
	
	public Point(char n_point, double abscisse)
	
	{
		System.out.println("Création d'un point avec des paramètres");
		
		nom_point = n_point;
		x = abscisse;
		nbreInstancesBis++;
		
	}
	
	
	public char getNomPoint()
	{
		return nom_point;
	}
	
	public void setNomPoint(char nom_point)
	{
		this.nom_point = nom_point;
	}
	
	public double getX()
	{
		return x;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	
	
	
	public String affiche()
	{
		return "\t" +this.nom_point+" est un point d'abscisse "+this.x;
	}
	
	
	public void translate(double val_translate)
	{
		this.x += val_translate; 
	}
	
	public static int getNbreInstancesBis()
	{
		return nbreInstancesBis;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
