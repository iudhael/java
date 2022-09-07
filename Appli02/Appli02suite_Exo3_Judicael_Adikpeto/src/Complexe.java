import java.util.Scanner;

public class Complexe {
	private double partie_reel;
	private double partie_imaginaire;
	
	public Complexe()
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Saisissez la  partie reel du nombre complexe");
		System.out.print("\t a : ");
		
		  partie_reel= sc.nextDouble(); 
		 
		 System.out.println("Saisissez la  partie imaginaire du nombre complexe");
			System.out.print("\t b : ");
			
			 partie_imaginaire = sc.nextDouble(); 
		
		
	}
	
	/*public Complexe(double p_reel, double p_imaginaire)
	{
		partie_reel = p_reel;
		partie_imaginaire = p_imaginaire;
		
	}
	*/
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double getPartieRe()
	{
		return partie_reel;
	}
	
	public void setPartieRe(double partie_reel)
	{
		this.partie_reel = partie_reel;
		
	}
	
	
	public double getPartieImg()
	{
		return partie_imaginaire;
	}
	
	public void setPartieImg(double partie_imaginaire)
	{
		this.partie_imaginaire = partie_imaginaire;
		
	}
	
	
	
	public String  plus(Complexe z0)
	{
		if ((this.partie_imaginaire+z0.partie_imaginaire) < 0)
			return "La somme donne : "+((this.partie_reel+z0.partie_reel)+""+(this.partie_imaginaire+z0.partie_imaginaire))+"*i";
		else
			return "La somme donne : "+((this.partie_reel+z0.partie_reel)+"+"+(this.partie_imaginaire+z0.partie_imaginaire))+"*i";
	}
	
	
	public String  moins(Complexe z0)
	{
		if ((this.partie_imaginaire-z0.partie_imaginaire) < 0)
			return "La soustraction donne : "+((this.partie_reel-z0.partie_reel)+""+(this.partie_imaginaire-z0.partie_imaginaire))+"*i";
		else
			return "La soustraction donne : "+((this.partie_reel-z0.partie_reel)+""+(this.partie_imaginaire-z0.partie_imaginaire))+"*i";
	}
	
	
	
	
	
	
	
	public String affiche(){ 
	    return "\t "+this.partie_reel+" + "+this.partie_imaginaire+" * i"; 
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
