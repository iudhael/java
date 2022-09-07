import java.util.Scanner;

public class Gestion_Etudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String reponse = new String("o"); //initialisation
		do
		{
		System.out.println("Hello");
		
		//De créer 3 étudiants par des informations tapées au clavier
		System.out.println("");
		System.out.println("");
		System.out.println("Le nombre d'étudiant  est : " + Etudiant.getNbreInstancesBis()); 
		
		Etudiant E1 = new Etudiant(nom(),prenom(),fil(),nationalite(),age());
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Le nombre d'étudiant  est : " + Etudiant.getNbreInstancesBis()); 
		Etudiant E2 = new Etudiant(nom(),prenom(),fil(),nationalite(),age());
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Le nombre d'étudiant  est : " + Etudiant.getNbreInstancesBis()); 
		Etudiant E3 = new Etudiant(nom(),prenom(),fil(),nationalite(),age());
		
		System.out.println("Le nombre d'étudiant  est : " + Etudiant.getNbreInstancesBis()); 
		System.out.println("");
		System.out.println("");
		
		/*
		 * De sortir les informations relatives à l’étudiant le plus âgé. 
		 * De sortir l’Etudiant le moins âgé. 
		 */
		System.out.println("");
		compar(E1.getAgeEtudiant(),E2.getAgeEtudiant(),E3.getAgeEtudiant(),E1,E2,E3);
		System.out.println("");
		System.out.println("");
		
		//D’afficher tous les 3 étudiants avec leurs caractéristiques respectives. 
		
		System.out.println("Hello "+E1.affiche());
		System.out.println("");
		
		System.out.println("Hello "+E2.affiche());
		System.out.println("");
		
		System.out.println("Hello "+E3.affiche());
		System.out.println("");
		
		
		
		
		
		do 
		   { 
			 System.out.println("Voulez-vous réessayer ? (O/N)"); 
				reponse = sc.nextLine();
				
				reponse = reponse.substring(0,1);
				reponse = reponse.toUpperCase();
				//System.out.println(reponse); 
			
		   } while(!reponse.equals("O") && !reponse.equals("N"));
		
		}while(reponse.equals("O"));
		
		
		
	}

	

	
	
	public static String nom()
	{
		Scanner sc = new Scanner(System.in);
		String nom = new String();
		System.out.println("Saisissez le nom de l'étudiant ");
		System.out.print("\t nom : ");
		nom = sc.nextLine();
		return nom;
	}
	
	
	public static String prenom()
	{
		Scanner sc = new Scanner(System.in);
		String prenom = new String();
		System.out.println("Saisissez le prenom de l'étudiant ");
		System.out.print("\t prénom : ");
		prenom = sc.nextLine();
		return prenom;
	}
	
	public static String fil()
	{
		Scanner sc = new Scanner(System.in);
		String fil = new String();
		System.out.println("Saisissez la filière de l'étudiant ");
		System.out.print("\t filière : ");
		fil = sc.nextLine();
		return fil;
	}
	
	public static String nationalite()
	{
		Scanner sc = new Scanner(System.in);
		String nationalite = new String();
		System.out.println("Saisissez la nationalité de l'étudiant ");
		System.out.print("\t nationalité : ");
		nationalite = sc.nextLine();
		return nationalite;
	}
	
	public static int age()
	{
		Scanner sc = new Scanner(System.in);
		int age ;
		System.out.println("Saisissez l'age de l'étudiant ");
		System.out.print("\t age : ");
		age = sc.nextInt();
		return age;
	}
	
	
	public static void compar(int n1, int n2, int n3, Etudiant e1,Etudiant e2, Etudiant e3)
	{
		
		if((n1<n2) && (n2<n3)) 
			{
				System.out.println("Etudiant le plu agé : "+e3.affiche());
				System.out.println("");
				System.out.println("Etudiant le moins agé : "+e1.affiche());
				
				
			
			}

	    else if((n1<n3) && (n3<n2)) 
	    {
			System.out.println("Etudiant le plu agé : "+e2.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e1.affiche());
			
			
		
		}
		
		
	    else if((n2<n1) && (n1<n3))
	    {
			System.out.println("Etudiant le plu agé : "+e3.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e2.affiche());
			
			
		
		}

	    else if((n2<n3) && (n3<n1))
	    {
			System.out.println("Etudiant le plu agé : "+e1.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e2.affiche());
			
			
		
		} 

	    else if((n3<n1) && (n1<n2))
	    {
			System.out.println("Etudiant le plu agé : "+e2.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e3.affiche());
			
			
		
		} 

	    else if((n3<n2) && (n2<n1))
	    {
			System.out.println("Etudiant le plu agé : "+e1.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e3.affiche());
			
			
		
		}
	    
	    
	    
	    if((n1==n2) && (n3<n1))
	    {
	    	System.out.println("On 2 étudiants plus agé : ");
			System.out.println("Etudiant le plu agé : "+e1.affiche());
			System.out.println("");
			System.out.println("Etudiant le plu agé : "+e2.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e3.affiche());
			
			
		
		}	
	    
	    else if((n1==n3) && (n2<n1))
	    {
	    	System.out.println("On 2 étudiants plus agé : ");
			System.out.println("Etudiant le plu agé : "+e1.affiche());
			System.out.println("");
			System.out.println("Etudiant le plu agé : "+e3.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e2.affiche());
			
			
	    }
	    
	    else if((n3==n2) && (n2<n1))
	    {
	    	System.out.println("On 2 étudiants moins agé : ");
			System.out.println("Etudiant le plu agé : "+e1.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e3.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e2.affiche());
			
			
	    }
	    
	    else if((n1==n2) && (n3>n1))
	    {
	    	System.out.println("On 2 étudiants moins agé : ");
	 			System.out.println("Etudiant le plu agé : "+e3.affiche());
	 			System.out.println("");
	 			System.out.println("Etudiant le moins agé : "+e1.affiche());
	 			System.out.println("");
	 			System.out.println("Etudiant le moins agé : "+e2.affiche());
	 			
	 			
	 	    }
	    
	    else if((n1==n3) && (n2>n1)) 
	    {
	    	System.out.println("On 2 étudiants moins agé : ");
	 			System.out.println("Etudiant le plu agé : "+e2.affiche());
	 			System.out.println("");
	 			System.out.println("Etudiant le moins agé : "+e1.affiche());
	 			System.out.println("");
	 			System.out.println("Etudiant le moins agé : "+e3.affiche());
	 			
	 			
	 	    }
	    
	    else if((n3==n2) && (n2>n1)) 
	    {
	    	System.out.println("On 2 étudiants plus agé : ");
			System.out.println("Etudiant le plu agé : "+e2.affiche());
			System.out.println("");
			System.out.println("Etudiant le plu agé : "+e3.affiche());
			System.out.println("");
			System.out.println("Etudiant le moins agé : "+e1.affiche());
			
			
	    } 
	    
	    else if((n3==n2) && (n2==n1))
	    {
	    	System.out.println("Les 3 étudiants ont meme age");
	    	
			System.out.println("Etudiant1 : "+e1.affiche());
			System.out.println("");
			System.out.println("Etudiant2 : "+e2.affiche());
			System.out.println("");
			System.out.println("Etudiant3 : "+e3.affiche());
			
			
	    } 
	    
		
		
	}
	
	
	
	
	
	
	
}
