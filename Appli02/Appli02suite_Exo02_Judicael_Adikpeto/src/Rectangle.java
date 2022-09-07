import java.util.Scanner;

public class Rectangle {

	private double longeur;
	private double largeur;
	
	public Rectangle()
	{
		System.out.println("Création d'un rectangle...");
		Scanner sc = new Scanner(System.in);
		
		do {
			
		
		System.out.println("Saisissez la  longeur du rectangle");
		System.out.print("\t longeur : ");
		
		 longeur = sc.nextDouble(); 
		 
		 System.out.println("Saisissez la  largeur du rectangle");
			System.out.print("\t largeur : ");
			
			 largeur = sc.nextDouble(); 
		 
		}while(longeur<0 || largeur<0 || (longeur < largeur));
		
		
	}
	
	/*public Rectangle(double long_rect, double larg_rect)
	{
		
		System.out.println("Création d'un rectangle...");
		longeur =long_rect;
		largeur = larg_rect;
		while(this.longeur < this.largeur){
			
			 longeur = this.saisi_long();
			 largeur = this.saisi_larg();
			
			
		}
		
		
		
	}*/
	
	

	
	
	
	
	public double getLongeurRect() {
		return longeur;
	}
	
	public void setLongeurRect(double longeur) {
		this.longeur = longeur; 
	}
	
	
	
	public double getLargeurRect() {
		return largeur;
	}
	
	public void setLargeurRect(double largeur) {
		this.largeur = largeur; 
	}
	
	
	
	public double perimetre(){ 
	    return (this.longeur+this.largeur)*2 ; 
	} 
	
	public double aire(){ 
	    return (this.longeur*this.largeur) ;
	} 
	
	public String estcarre(){ 
		if (this.longeur == this.largeur)
			return "\t C'est un carré"; 
		else
			return "\t Ce n'est pas un carré"; 
	} 
	
	public String afficherect(){ 
	    return "\t Rectangle de longeur : "+this.longeur+" ,de largeur : "+this.largeur+" de perimetre : "+this.perimetre()+" et d'aire : "+this.aire()+ " ,"+this.estcarre(); 
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
