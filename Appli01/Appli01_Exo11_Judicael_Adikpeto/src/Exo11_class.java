import java.util.Scanner;

public class Exo11_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ce programme permet de calculer la somme des n premiers termes de la « série harmonique », c’est-à-dire la somme :1 + 1/2 + 1/3 + 1/4 + ..... + 1/n*/
		/*La valeur de n sera lue en donnée.*/
		

	    int v,j;
	    double s=0;

	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		
		System.out.println("Saisissez un entier");
		System.out.print("\t v = : ");
		v = sc.nextInt();
		
	    for (j=1; j<=v; j++)   
	    	{
	    		s=s+(1.0/j);                                 
	    		
	    	
	    	}
	    System.out.println("La somme des "+v+" premiers termes est:"+s);

	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
