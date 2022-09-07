import java.util.Scanner;

public class Exo9_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* programme qui demande un nombre compris entre 10 et 20, jusqu’à ce 
que la réponse convienne. En cas de réponse supérieure à 20, on fera apparaitre 
un message : Plus petit ! , et inversement, Plus grand ! si le nombre est inférieur à 
10*/
		
		double n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
       

       
    do
    {
    	 System.out.println("Saisissez un nombre compris entre 10 et 20.");
         System.out.print("\t n = : ");
         n = sc.nextInt();
         if(n>20)
        	 System.out.println("Plus petit!");
         if(n<10)
        	 System.out.println("Plus grand!");
    }while(n<=10 || n>=20); // 10 et 20 ne sont pas prise en compte
    
    System.out.println("Correcte!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
