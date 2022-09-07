import java.util.Scanner;

public class Exo7_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* programme  qui  demande  deux  nombres  à  l’utilisateur  et  l’informe 
		ensuite si leur produit est négatif ou positif (on laisse de côté le cas où le produit 
		est nul). Attention toutefois : on ne doit pas calculer le produit des deux nombres. */
		
		
		 float n1,n2;
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Hello!");
	        System.out.println("Saisissez un nombre");
	        System.out.print("\t n1 = : ");
	        n1 = sc.nextFloat();
	        System.out.println("Saisissez encore un nombre");
	        System.out.print("\t n2 = : ");
	        n2 = sc.nextFloat();

	    if((n1>0 && n2>0) || (n1<0 && n2<0))
	        System.out.println("Ce nombre est positif\n");
	    else
	        if((n1<0 && n2>0) || (n1>0 && n2<0))
	        	 System.out.println("Le produit sera negatif");

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
