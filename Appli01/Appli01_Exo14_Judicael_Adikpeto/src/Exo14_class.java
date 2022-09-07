import java.util.Scanner;


public class Exo14_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ce programme demande la note d’un étudiant puis affiche la note suivi de l'appréciations */
		
		
		
		 double note;
		 Scanner sc = new Scanner(System.in);
			
		System.out.println("Hello!");
			
		System.out.println("Saisissez un entier");
		System.out.print("\t note = : ");
		note = sc.nextDouble();
		
	    if(note > 0 && note < 5) 
	    	System.out.println(note+" : Trop nul.");
	    
	    else if((note<10) && (note>=5)) 
	    	System.out.println(note+" : Nul.");
	    
	    else if((note<15) && (note>=10))
	    	System.out.println(note+" : Pas trop nul.");
	    
	    else if((note<20) && (note>=15)) 
	    	System.out.println(note+" : Trop top.");
	    
	    else if(note==20)
	    	System.out.println(note+" : T'es un boss.");

	    else
	    	System.out.println(note+" : N'est pas une note valide.");
		
		
		
	    System.out.println("Bye !!!");
		
		
		
		
		
		
		
		
	}

}
