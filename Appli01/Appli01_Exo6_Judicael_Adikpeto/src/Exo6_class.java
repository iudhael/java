import java.util.Scanner;

public class Exo6_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* programme qui affiche le plus grand et le plus petit d’une suite d’entiers 
		saisis. Les nombres saisis ne sont pas à conserver en mémoire. La suite se termine 
		avec la valeur 0.*/
		
		float min=0, max = 0, nbre;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour !\nSaisissez une suite de nombre.");
		do
		{
			
			System.out.println("\t nbre : ");
			
			nbre = sc.nextFloat();
			
			
			
			if(nbre > max)
                max = nbre;
            else
                min = nbre;
			
		
		}while(nbre != 0);
		
		System.out.println("Le plus grand de cette suite d'entiers est : "+max);
		System.out.println("Le plus petit de cette suite d'entiers est : "+min);
		
		
		
		
		
		
		
		
		
		

	}

	


	

}
