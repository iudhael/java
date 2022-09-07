import java.util.Scanner;

public class Scalaire_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 un programme qui calcule  le  produit  scalaire  de  deux vecteurs,  implémentés  au  moyen  de  tableaux  unidimensionnels. 
		 */
		int i, nMax = 10, taille;
		float n, scalaire = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		System.out.println("Saisissez la taille d'un vecteur");
		
		do
		{
			System.out.println("Saisissez taille");
			System.out.print("\t nMax = : ");
			n = sc.nextFloat();
			
			taille = (int)n;
			
		
		}while(n < 1 || n > nMax);
		
		float 	val, v1[] = new float[taille], 
				v2[] = new float[taille] ;
		
		System.out.println("Ok !!");
		
		System.out.println("Saisissez les coordonées du premier vecteur");
		for(i = 0; i<taille; i++)
		{
			System.out.println("Saisissez le coordonées "+i+" du premier vecteur");
			System.out.print("\t x"+i+" = : ");
			val = sc.nextFloat();
			v1[i] = val;
			
			
		}
		
		System.out.println("Saisissez les coordonées du second vecteur");
		for(i = 0; i<taille; i++)
		{
			System.out.println("Saisissez le coordonées "+i+" du second vecteur");
			System.out.print("\t x"+i+" = : ");
			val = sc.nextFloat();
			v2[i] = val;
			
			
		}
		
		System.out.println("Calcule du produit scalaire");
		
		for(i = 0; i<taille; i++)
		{
			
			scalaire += (v1[i] * v2[i]);
			
			
		}
		
		
		System.out.println("Le produit scalaire donne "+scalaire);
		
		
		
		
	}

}
