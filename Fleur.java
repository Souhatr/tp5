package tp5;

public class Fleur extends Plante {
	private String couleur;
	private int moisF;
	public Fleur(String nom, float hauteur, int age, float prix, String couleur, int moisF) {
        super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }
	public String toString()
	{
		return super.toString()+"couleur:"+couleur;
	}
	public void description()
	{
		System.out.println(toString());
	}
	public void fleurir()
	{
		if((moisF==4)||(moisF==5)||(moisF==6))
			System.out.println("la fleur est en en fleurs");
		else
			System.out.println("la fleur n'est pas en fleurs");
	}
	public String getCouleur() {
		return couleur;
	}
	
}
