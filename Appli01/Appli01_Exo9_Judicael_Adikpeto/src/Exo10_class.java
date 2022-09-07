import java.util.Scanner;

public class Exo10_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* programme qui demande un nombre de départ, et qui calcule la somme 
des  entiers  jusqu’à  ce  nombre.  Par  exemple,  si  l’on  entre  5,  le  programme  doit 
calculer : 1 + 2 + 3 + 4 + 5 = 15  */
		
		double n;
	    int i,N,som=0;
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		
		System.out.println("Saisissez un nombre");
		System.out.print("\t n = : ");
		n = sc.nextDouble();

	            N=(int)n;
	        for(i=1; i<=N; i++)
	        {
	            som=som+i;
	        }
	        System.out.println("la somme est : "+som);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
