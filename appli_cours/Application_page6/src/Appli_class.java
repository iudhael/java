import java.util.Scanner;

public class Appli_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double note;
	
		 Scanner sc = new Scanner(System.in);
					
		 System.out.println("Bonjour !\nSaisissez une note comprise entre 0 et 20.");
		 System.out.print("\t note : ");
		 if (sc.hasNextDouble())
			{
			 	
				note = sc.nextDouble();
				
				if (note > 0 && note < 20)
					{
					 
					 if(note >= 0 && note < 5 )
						{
							System.out.println("Vous avez taper "+ note + ". C'est Nul !!");
							
							
						}
						
					else if(note >= 5 && note < 10 )
					{
							System.out.println("Vous avez taper "+ note + ". C'est Médiocre !!");
							
							
					}
						
					else if(note >= 10 && note < 15 )
					{
							System.out.println("Vous avez taper "+ note + ". C'est Assez bon !!");
							
							
					}
						
					else if(note >= 15 && note <= 20 )
					{
						System.out.println("Vous avez taper "+ note + ". C'est Très bon !!");
							
							
					}			
					}
				else
				{
						
					System.out.println("Votre saisi n'est pas correcte.\nFin !!");
						
				}			
			}
			else
			{
				sc.next();
				System.out.println("Votre saisi n'est pas correcte.");
			}
				
		
		
		
	}
	}
		
