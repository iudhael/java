import java.util.Scanner;

public class Employe {
			
		private int matricule;
		private String nom;
		private String prenom;
		private String dateNaissance;
		private String dateEmbauche;
		private double salaire;
		 
		 public Employe()
		 {
			 
			 System.out.println("matricule");
			 Scanner sc = new Scanner(System.in);
			  matricule= sc.nextInt();
			  sc.nextLine();
			 System.out.println("nom:");
			  nom= sc.nextLine();
			 System.out.println("prenom:");
			  prenom = sc.nextLine();
			 System.out.println("date de Naissance:");
			  dateNaissance = sc.nextLine();
			 System.out.println("date d'Embauche:");
			  dateEmbauche = sc.nextLine();
			  System.out.println("Salaire:");
			  salaire = sc.nextDouble();
	
		 }

		public int getMatricule() {
			return matricule;
		}

		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(String dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		public String getDateEmbauche() {
			return dateEmbauche;
		}

		public void setDateEmbauche(String dateEmbauche) {
			this.dateEmbauche = dateEmbauche;
		}

		public double getSalaire() {
			return salaire;
		}

		public void setSalaire(double salaire) {
			this.salaire = salaire;
		}
		 
		 
		public String afficheemploye(){
			 return "\t"+this.matricule+" est votre matricule:"+this.nom+ "est votre nom, : "+this.dateNaissance+", est votre date de naissance:"+this.dateEmbauche+",est la date d'embauche:"+this.salaire+", est votre salaire:";
			}
		public int age(){
			int n , anne=0,ag;
			char a;
			String b="";
			n= this.dateNaissance.lastIndexOf("/");
			for (int i=1; i<5; i++)
			{
				a = this.dateNaissance.charAt((n+i));
				b +=a;
			}
			anne = Integer.valueOf(b).intValue();
			
			ag = 2022-anne;
			return ag;
			
			
			
		}
	        	  
		  

	
}
