import java.util.Scanner;

public class Exo15_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ce  programme permet de  calculer le volume d’un pavé droit et d'affiche ce volume en précisant les dimensions correspondant au pavé droit ;*/
		
		double L,l,h,V;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		
		do 
		{
		
		System.out.println("Saisissez la longeur du pave droit");
		System.out.print("\t L = : ");
		L = sc.nextDouble();
		}while(L<0);
		
		do
		{
		System.out.println("Saisissez la largeur du pave droi");
		System.out.print("\t l = : ");
		l = sc.nextDouble();
		}while(l<0);
		
		do
		{
		System.out.println("Saisissez la hauteur du pave droit");
		System.out.print("\t h = : ");
		h = sc.nextDouble();
		}while(h<0);
		
        V=L*l*h;
        
        System.out.println("Le volume de votre pave droit de longeur = "+L+", de largeur="+l+", et de hauteur="+h+" est: "+V);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
