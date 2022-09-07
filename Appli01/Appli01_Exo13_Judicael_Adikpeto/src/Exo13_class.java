import java.util.Scanner;


public class Exo13_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ce  programme  permet à la fois de :Saisir 3 réels, calculer et afficher leur moyenne. Et de ranger ces 3 réels par ordre croissant*/
		
		
	    double moy,  n1,n2,n3;;
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		
		System.out.println("Saisissez un nombre");
		System.out.print("\t n1 = : ");
		n1 = sc.nextDouble();
		System.out.println("Saisissez encre un  nombre");
		System.out.print("\t n2 = : ");
		n2 = sc.nextDouble();
		System.out.println("Saisissez encore un nombre");
		System.out.print("\t n3 = : ");
		n3 = sc.nextDouble();
		
	    moy=(n1+n2+n3)/(double)3; // caste de 3
	    System.out.println("la moyenne de ces trois nombres est: "+moy);
		
		
		
	    if((n1<n2) && (n2<n3)) System.out.println("l'ordre croissant est : " +n1+ " " +n2+ " " +n3);

	    else if((n1<n3) && (n3<n2)) System.out.println("l'ordre croissant est : " +n1+ " " +n3+ " " +n2);

	    else if((n2<n1) && (n1<n3)) System.out.println("l'ordre croissant est : " +n2+ " " +n1+ " " +n3);

	    else if((n2<n3) && (n3<n1)) System.out.println("l'ordre croissant est : "+ n2+ " " +n3+ " " +n1);

	    else if((n3<n1) && (n1<n2)) System.out.println("l'ordre croissant est : " +n3+ " " +n1+ " " +n2);

	    else if((n3<n2) && (n2<n1)) System.out.println("l'ordre croissant est : " +n3+ " " +n2+ " " +n1);  
	    
	    
	    
	    if((n1==n2) && (n3<n1))		System.out.println("l'ordre croissant est : " +n3+ " " +n1+ " " +n2);
	    
	    else if((n1==n3) && (n2<n1)) System.out.println("l'ordre croissant est : " +n2+ " " +n3+ " " +n1);
	    
	    else if((n3==n2) && (n2<n1)) System.out.println("l'ordre croissant est : " +n2+ " " +n3+ " " +n1);
	    
	    else if((n1==n2) && (n3>n1))		System.out.println("l'ordre croissant est : " +n1+ " " +n2+ " " +n3);
	    
	    else if((n1==n3) && (n2>n1)) System.out.println("l'ordre croissant est : " +n1+ " " +n3+ " " +n2);
	    
	    else if((n3==n2) && (n2>n1)) System.out.println("l'ordre croissant est : " +n1+ " " +n2+ " " +n3);
	    
	    else if((n3==n2) && (n2==n1)) System.out.println("Pas d'ordre croissant");
	    
	    
	    System.out.println("bye");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
