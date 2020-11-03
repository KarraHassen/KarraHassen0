package TotalPrice;

public class LigneCde {
	
	Produit p;
	private int qte;
	
	
	public Produit getP() {
		return p;
	}
	public void setP(Produit p) {
		this.p = p;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public LigneCde(Produit p, int qte) {
		super();
		this.p = p;
		this.qte = qte;
	}
	
	public float CalculerPrixTotale() {
		float s = p.getPrixuni()*qte;
		return s;
		
		}
	public void AficheCde() {
		System.out.println(p.getNom());
		System.out.println(p.getPrixuni());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
