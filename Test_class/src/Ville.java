
public class Ville {

	//Stocke le nom de notre ville 
	private String nomVille; 
	
	//Stocke le nom du pays de notre ville 
	private String nomPays; 
	
	//Stocke le nombre d'habitants de notre ville 
	private int nbreHabitants; 
	
	private char categorie; 
	
	private static int nbreInstancesBis = 0;
	
	
	
	
	
	//Constructeur par défaut 
	public Ville(){ 
	   System.out.println("Création d'une ville !"); 
	   nomVille = "Inconnu"; 
	   nomPays = "Inconnu"; 
	   nbreHabitants = 0; 
	   this.setCategorie(); 
	   nbreInstancesBis++;
	} 
	
	
	
	
	//Constructeur avec paramètres 
	public Ville(String pNom, int pNbre, String pPays)
	{ 
		System.out.println("Création d'une ville avec des paramètres!"); 
		nomVille = pNom; 
		nomPays = pPays; 
		nbreHabitants = pNbre; 
		this.setCategorie();
		nbreInstancesBis++;
	}




	public String getNomVille() {
		return nomVille;
	}




	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}




	public String getNomPays() {
		return nomPays;
	}




	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}




	public int getNbreHabitants() {
		return nbreHabitants;
	}




	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
		this.setCategorie();
 	}




	public char getCategorie() {
		return categorie;
	}




	public void setCategorie() {
		 int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000}; 
		 char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G','H'}; 
		 int i = 0; 
		 while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i]) 
			 i++; 
		 this.categorie = categories[i]; 
		
		
	} 
		 
	
	
	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}




	/*public static void setNbreInstancesBis(int nbreInstancesBis) {
		Ville.nbreInstancesBis = nbreInstancesBis;
	}*/




	//Retourne la description de la ville 
	public String decrisToi(){ 
	    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ",elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie; 
	} 
		
	
	//Retourne une chaîne de caractères selon le résultat de la comparaison 
	public String comparer(Ville v1){ 
	    String str = new String(); 
	    if (v1.getNbreHabitants() > this.nbreHabitants) 
	       str = v1.getNomVille()+" est une ville plus peuplée que "+this.nomVille; 
	    else 
	       str = this.nomVille+" est une ville plus peuplée que "+v1.getNomVille(); 
	    return str; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
