import java.util.Scanner;

public class Exo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reponse = "" ;
		 int l;
	 Scanner lire = new Scanner(System.in);
		do {
			do {
				System.out.println("Combien de Point voulez-vous créer");
				l = lire.nextInt();
			}while(l < 0);
			int argx[] = new int[l];
			int argy[] = new int[l];
			PointA Mon_point[] = new PointA[l];
			for(int i = 0 ; i < l ; i++) {
				System.out.println("Le Point\t"+(i+1));
				System.out.println("\n");
				Mon_point[i] = new PointA(abcisse(),ordonné());
				System.out.println("L'argument de déplacement x\t");
				argx[i] = lire.nextInt();
				System.out.println("L'argument de déplacement y\t");
				argy[i] = lire.nextInt();
				
			}
			System.out.println("\n\n \tDéplacement des points");
			for(int j = 0 ; j < l ; j++) {
				System.out.println("\t Point.."+(j+1));
				Mon_point[j].affiche();
				System.out.println("\t resultat");
				Mon_point[j].deplace(argx[j],argy[j]);
				Mon_point[j].affiche();
				
				
			}
			lire.nextLine();

			do{
				System.out.println("Voulez-vous recommencer ? (O/N)");
				reponse = lire.nextLine();
				reponse = reponse.substring(0,1);
				reponse = reponse.toUpperCase();
				}while(!reponse.equals("O") && !reponse.equals("N"));
		}while( reponse.equals("O"));
        
	}
	public static  int  abcisse() {
		 int n ;
		 Scanner lire = new Scanner(System.in);
		 System.out.print("Entrer l'abcisse \n") ;
		 n = lire.nextInt();
			return n;
		}
	public static  int  ordonné() {
		 int m ;
		 Scanner lire = new Scanner(System.in);
		 System.out.print("Entrer l'abcisse \n") ;
		 m = lire.nextInt();
			return m;
		}
}
