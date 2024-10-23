package tp5;

public class Plante {
	protected String nom;
	protected float hauteur;
	protected int age;
	protected float prix;
	public Plante(String nom,float hauteur,int age,float prix)
	{
		this.nom=nom;
		this.hauteur=hauteur;
		this.age=age;
		this.prix=prix;
	}
	public String toString()
	{
		return "nom:"+nom+"hauteur:"+hauteur+"age:"+age+"prix:"+prix+"dinars";
	}
	public void description()
	{
		System.out.println(toString());
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
