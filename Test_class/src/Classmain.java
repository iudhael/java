
public class Classmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Ville ville = new Ville(); 
		System.out.println(ville.nomVille); 
		ville.nomVille = "la t�te � toto ! ! ! !"; 
		System.out.println(ville.nomVille); 
		Ville ville2 = new Ville("Marseille", 123456789, "France"); 
		ville2.nomPays = "La t�te � tutu ! ! ! ! "; 
		System.out.println(ville2.nomPays); 
		*/
		
		
		/*Ville v = new Ville(); 
		Ville v1 = new Ville("Marseille", 123456, "France"); 
		Ville v2 = new Ville("Rio", 321654, "Br�sil"); 
		System.out.println("\n v = "+v.getNomVille()+" ville de "+v.getNbreHabitants()+ " habitants se situant en"+v.getNomPays()); 
		System.out.println(" v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays()); 
		System.out.println(" v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n"); 
		*/
		/* 
		Nous allons interchanger les Villes v1 et v2 tout �a par l'interm�diaire d'un autre objet Ville. 
		*/ 
		/*Ville temp = new Ville(); 
		temp = v1; 
		v1 = v2; 
		v2 = temp; 
		System.out.println(" v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays()); 
		System.out.println(" v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n"); 
		*/
		/* 
		Nous allons maintenant interchanger leurs noms cette fois par le biais de leurs mutateurs. 
		*/ 
		/*v1.setNomVille("Hong Kong"); 
		v2.setNomVille("Djibouti"); 
		System.out.println(" v1 = "+v1.getNomVille()+" ville de "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays()); 
		System.out.println(" v2 = "+v2.getNomVille()+" ville de "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n"); 	
	*/
		
	/*	
		Ville v = new Ville(); 
		Ville v1 = new Ville("Marseille", 1236, "France"); 
		Ville v2 = new Ville("Rio", 321654, "Br�sil"); 
		System.out.println("\n\n"+v1.decrisToi()); 
		System.out.println(v.decrisToi()); 
		System.out.println(v2.decrisToi()+"\n\n"); 
		System.out.println(v1.comparer(v2)); 
		*/
		
		/*Ville v = new Ville(); 
		 
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis()); 
		Ville v1 = new Ville("Marseille", 1236, "France"); 
		 
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis()); 
		Ville v2 = new Ville("Rio", 321654, "Br�sil"); 
	 
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbreInstancesBis()); 
		*/
		
		
		
		Capitale cap = new Capitale("Paris", 654987, "France", "la tour Eiffel"); 
		System.out.println("\n"+cap.decrisToi()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
