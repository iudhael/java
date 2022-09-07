import java.util.Scanner;

public class Exo2_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double y, val_trans;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello");
		
		System.out.println("Saisissez le nom de votre point");
		System.out.print("\t nom : ");
		
		String n = sc.nextLine(); 
		char carac = n.charAt(0); 
		
		System.out.println("Saisissez l'abscisse du point");
		System.out.print("\t abscisse : ");
		
		y = sc.nextDouble(); 
		 
		Point p1 = new Point(carac, y);
		
		System.out.println("\t p1 "+p1.affiche());
		
		
		System.out.println("Le nombre de point est : " + Point.getNbreInstancesBis()); 
		
		/*
		 Point p2 = new Point('l', 4);
		 	
		System.out.println("Le nombre de point est : " + Point.getNbreInstancesBis());
		*/
		
		System.out.println("Saisissez la valeur de translation");
		System.out.print("\t val : ");
		
		val_trans = sc.nextDouble(); 
		
		p1.translate(val_trans);
		System.out.println("\t p1 "+p1.affiche());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
