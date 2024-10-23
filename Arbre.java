package tp5;

public class Arbre extends Plante {
	private String type_feuillage;
	final double AbsorMoyenne=22;
	public Arbre(String nom, float hauteur, int age, float prix,String type_feuillage)
	{
		super(nom,hauteur,age,prix);
		this.type_feuillage=type_feuillage;
		
	}
	public String toString()
	{
		return super.toString()+"type_feuillage"+type_feuillage;
	}
	public void description()
	{
		System.out.println(toString());
	}
	public double absorptionCO2()
	{
		double s=0;
		if(hauteur>50)
		 s=s+this.AbsorMoyenne+3;
		else
			s=s+this.AbsorMoyenne;
		return s;
	}
	public String getType_feuillage() {
		return type_feuillage;
	}
	
	
}
