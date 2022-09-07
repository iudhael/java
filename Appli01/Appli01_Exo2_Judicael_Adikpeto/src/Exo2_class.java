import java.util.Scanner;

public class Exo2_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// programme qui saisit deux entiers et affiche leur produit
		
		int n1, n2;
		
		System.out.println("Saisissez un entier.\n\t n1 :");
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		
		System.out.println("Saisissez encore un entier.\\n\\t n2 :");
		
		
		n2 = sc.nextInt();
		
		
		System.out.println("Le produit de "+n1+"et "+n2+"est : "+(n1*n2));
		
		
		
		
		
		

	}

}
