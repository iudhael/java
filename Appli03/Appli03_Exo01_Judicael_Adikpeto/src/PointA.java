
public class PointA extends Point {

	public PointA(int abs, int ord) {
		super(abs, ord);
		
	}
	public void deplace(int dabs, int dord) {
		super.deplace(dabs, dord);
			
	}
	public void affiche() {
		System.out.println("Abssice\t"+this.getX()+"\t et son Ordonné est\t"+this.getY());
	}
	
	
}
