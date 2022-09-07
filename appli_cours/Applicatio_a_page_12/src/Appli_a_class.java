import java.util.Scanner;

public class Appli_a_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N; 
		
		
		System.out.println("Bonjour !\nSaisissez un entier N positif supérieure à 0.");
		System.out.print("\t N : ");
		Scanner sc = new Scanner(System.in);
			
		if (sc.hasNextInt())
		{
			N = sc.nextInt();
			if (N  > 0)
				{
					System.out.println("Vous avez taper "+ N + ".");
					for(int i = 1; i <= N; i++)
					{
						System.out.println(i + ") je ne dois pas être distrait au cours de JAVA ");
						
					}					
				}
			else if(N == 0)
			{
					
				System.out.println("Votre saisi n'est pas correcte.");
					
			}			
		}
		else
		{
			sc.next();
			System.out.println("Votre saisi n'est pas correcte.");
		}
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
