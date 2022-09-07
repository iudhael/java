import java.util.Scanner;

public class Exo5_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,max=0;
		
		 System.out.println("Hello!\n");
	     System.out.print("Saisissez un entier.\n\t a :");
	     Scanner sc = new Scanner(System.in);
			
	     a = sc.nextInt();
		
	     System.out.print("Saisissez encore un entier.\n\t b :");
	     
			
	     b = sc.nextInt();
	     
	     System.out.print("Saisissez encore un entier.\n\t c :");
	     
			
	     c = sc.nextInt();
	     
	     if(a>b && a>c)
	     {
	         max=a;
	         System.out.print("le plus grand est : "+a);
	     }
	     else if(b>a && b>c)
	     {
	         max=b;
	         System.out.print("le plus grand est: "+b);

	     }
	     else if(c>a && c>b)
	     {
	         max=c;
	         System.out.print("le plus grand est: "+c);
	     }
		
		
	}

}
