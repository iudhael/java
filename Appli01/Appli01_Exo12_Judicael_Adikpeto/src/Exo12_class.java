import java.util.Scanner;
import java.lang.Math;

public class Exo12_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ce programme permet de calculer le périmètre et la surface d’un cercle de rayon r. */
		
		
		
		double PI=3.14,perimetre,surface,r;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		
		System.out.println("Saisissez un entier");
		System.out.print("\t r = : ");
		r = sc.nextDouble();
        perimetre=2*PI*r;
        surface=Math.pow(r,2)*PI;
        System.out.println("Le perimetre de ce cercle est: "+ perimetre +" et sa surface est :"+surface);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
