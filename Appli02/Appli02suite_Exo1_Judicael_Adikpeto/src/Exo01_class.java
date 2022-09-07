import java.util.Scanner;


public class Exo01_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n;
		int l,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello");
		
		System.out.println("Saisissez le nombre delivre que vous voulez enter");
		System.out.print("\t n : ");
		
		 n = sc.nextDouble(); 
		
		l = (int)n;
		sc.nextLine();
		
		
		
		Livre livre[] = new Livre[l];
		
		for( i=0; i<livre.length; i++)
		{
			
			System.out.println("\t\tLivre"+(i+1));
			System.out.println("Saisissez le titre du livre"+(i+1));
			System.out.print("\t titre : ");
			
			String titre  = sc.nextLine(); 
			
			 
			 //sc.nextLine();
			// System.out.println("");
			 
			 System.out.println("Saisissez le nom de l'auteur du livre"+(i+1));
			 System.out.print("\t auteur : ");
			 String auteur  = sc.nextLine(); 
			//System.out.println("");
			//sc.nextLine();
			
			
			System.out.println("Saisissez le prix du livre"+(i+1));
			System.out.print("\t prix : ");
				
			double prix = sc.nextDouble(); 
			sc.nextLine();
			
			livre[i] = new Livre(titre, auteur, prix);
			System.out.println("\t"+livre[i].affiche());
			
		}	
		
		
	}

}
