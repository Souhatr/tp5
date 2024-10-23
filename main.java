package tp5;

public class main {

	public static void main(String[] args) {
		System.out.println("pepiniaire GREEN HANDS");
		Pepiniaire pepiniere=new Pepiniaire();
		Fleur rose= new Fleur(null,30,12,15,"Rouge",2);
		Fleur tulipe=new Fleur("Tulipe",20,8,12,"jaune",4);
		Arbre chene=new Arbre("chene",200,60,89,"Caduque");
		Arbre sapin=new Arbre("sapin",150,30,59,"presistant");
		rose.setNom("rose");
		System.out.println("la"+rose.getNom()+" a le couleur"+rose.getCouleur());
		pepiniere.ajoutePlante(rose);
		pepiniere.ajoutePlante(tulipe);
		pepiniere.ajoutePlante(chene);
		pepiniere.ajoutePlante(sapin);
		pepiniere.afficherInventaire();
		System.out.println("total Absorption co2 "+pepiniere.totalAbsorptionTotaleCO2());
		System.out.println("nombre d'arbres caduques dans la pepiniere"+pepiniere.CompterArbresCaduques());
		
		
		
	}

}
