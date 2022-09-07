
public class Livre {

	private String titre_livre;
	private String auteur_livre;
	private double prix ;
	private static int nbreInstancesBis = 0;
	
	
	public Livre(String t_livre,String a_livre, double prix_livre)
	
	{
		System.out.println("Création de livre avec des paramètres");
		
		titre_livre = t_livre;
		auteur_livre = a_livre;
		prix = prix_livre;
		nbreInstancesBis++;
		
	}
	

	
	public String getNomLivre() {
		return titre_livre;
	}




	public void setNomLivre(String titre_livre) {
		this.titre_livre = titre_livre;
	}
	
	
	public String getAuteurLivre() {
		return auteur_livre;
	}




	public void setAuteurLivre(String auteur_livre) {
		this.auteur_livre = auteur_livre;
	}
	
	
	
	public double getPrixLivre() {
		return prix;
	}




	public void setPrixLivre(double prix) {
		this.prix = prix;
	}
	
	
	
	public String affiche(){ 
	    return "\t"+this.titre_livre+" est un livre de "+this.auteur_livre+ ",il coute : "+this.prix; 
	} 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
