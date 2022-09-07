import java.util.Scanner;



public class Exo17_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ligne1, ligne2, col1,col2, i,j;
		
		float l1,c1,l2,c2, val;
			
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello!");
		
		
		do
		{
			System.out.println("Saisissez le nombre de ligne de votre premier matrix ");
			System.out.print("\t ligne = : ");
			l1 = sc.nextFloat();
			
			ligne1 = (int)l1;
			
		
		}while(l1 < 1);
		
		System.out.println("Le nombre de ligne de votre premier matrix est : \\n"+ligne1);
		
		do
		{
			System.out.println("Saisissez le nombre de colonne de votre premier matrix ");
			System.out.print("\t col = : ");
			c1 = sc.nextFloat();
			
			col1 = (int)c1;
			
		
		}while(c1 < 1);
		System.out.println("Le nombre de colonne de votre premier matrix est : \\n"+col1);
		
		do
		{
			System.out.println("Saisissez le nombre de ligne de votre seconde matrix ");
			System.out.print("\t ligne = : ");
			l2 = sc.nextFloat();
			
			ligne2 = (int)l2;
			
		
		}while(l2 < 1);
		
		System.out.println("Le nombre de ligne de votre second matrix est : \n"+ligne2);
		
		do
		{
			System.out.println("Saisissez le nombre de colonne de votre seconde matrix ");
			System.out.print("\t col = : ");
			c2 = sc.nextFloat();
			
			col2 = (int)c2;
			
		
		}while(c2 < 1);
		
		System.out.println("Le nombre de colonne de votre second matrix est : \n"+col2);
		
		if (ligne2 != col1)
			System.out.println("Multiplication de matrices impossible !");
			
		else
			System.out.println("Multiplication de matrices possible !");
		
		
		
		
		float mat1[][] = new float[ligne1][col1], 
				mat2[][] = new float[ligne2][col2];
				//resultat[][] = { {0,0,0,0,0},{0,0,0,0,0} };
				//resultat[][] = new float[ligne1][col2];
		
		
		for(i = 0; i<ligne1; i++)
		{
			System.out.println("Saisissez la ligne "+(i+1)+" de la premiere matrice");
			for(j = 0; j<col1; j++)
			{
				System.out.print("\t val"+(j+1)+" = : ");
				val = sc.nextFloat();
				mat1[i][j] = val;
				
				
				
			}
			
		}
		
		System.out.println("Votre premiere matrice donne : ");
		for(i = 0; i<ligne1; i++)
		{
			
			for(j = 0; j<col1; j++)
			{
				System.out.println("Mat1["+(i+1)+"]["+(j+1)+"] : "+mat1[i][j] );
				
			}
			
		}
		
		for(i = 0; i<ligne2; i++)
		{
			System.out.println("Saisissez la ligne "+(i+1)+" de la seconde matrice");
			for(j = 0; j<col2; j++)
			{
				System.out.print("\t val"+(j+1)+" = : ");
				val = sc.nextFloat();
				mat2[i][j] = val;
				
				
				
			}
			
		}
		
		System.out.println("Votre second matrice donne : ");
		for(i = 0; i<ligne2; i++)
		{
			
			for(j = 0; j<col2; j++)
			{
				System.out.println("Mat2["+(i+1)+"]["+(j+1)+"] : "+mat2[i][j] );
				
			}
			
		}
		
		
		
		System.out.println("Calcule de la matrix en cours ...\n" );
		
		for(i = 0; i<ligne1; i++)
		{
			
			for(j = 0; j<col2; j++)
			{
				resultat[i][j] += mat1[i][j] * mat2[j][i];
				
			}
			
		}
		
		

		System.out.println("Votre resultat est : ");
		for(i = 0; i<ligne1; i++)
		{
			
			for(j = 0; j<col2; j++)
			{
				System.out.println("Mat1["+(i+1)+"]["+(j+1)+"] : "+resultat[i][j] );
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
