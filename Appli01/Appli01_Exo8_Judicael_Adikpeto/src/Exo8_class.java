import java.util.Scanner;

public class Exo8_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*  programme  qui  demande  l’âge  d’un  enfant  à  l’utilisateur.  Ensuite,  il 
		l’informe de sa catégorie 
		*/
		
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
        System.out.println("Saisissez un nombre");
        System.out.print("\t age = : ");
        age = sc.nextInt();

    switch(age)
    {
    case 6:
    	System.out.println("l'enfant est de categorie Poussin");
        break;
    case 7:
    	System.out.println("l'enfant est de categorie Poussin");
        break;
    case 8:
    	System.out.println("l'enfant est de categorie Pupille");
        break;
    case 9:
    	System.out.println("l'enfant est de categorie Pupille");
        break;
    case 10 :
    	System.out.println("l'enfant est de categorie Minime");
        break;
    case 11 :
    	System.out.println("l'enfant est de categorie Minime");
        break;
   default:
       if(age>=12)
    	   System.out.println("l'enfant est de categorie Cadet");
       else
    	   System.out.println("Cette catégorie n'est pas répertoriée");
        break;
		
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
