import java.util.Scanner;

public class Exo4_class {

	public Exo4_class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// programme qui détermine si un entier saisi est pair ou impair
		
		int n;
        System.out.println("Hello!\n");
        System.out.print("Saisissez un nombre.\n\t n :");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
            
    if( n%2==0 && n>=0 )                                               
    	System.out.println("Ce nombre est pair.");
    else
    	System.out.println("Ce nombre est impair.");


	}

}
