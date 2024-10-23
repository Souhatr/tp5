package tp5;

public class Pepiniaire{
	   Plante inventaire[];
	   private final int  MAX_PLANTES=1000;
	   private int nbrPLantes;
	   public Pepiniaire()
	   {
		   inventaire=new Plante[MAX_PLANTES];
		   this.nbrPLantes=0;
	   }
	   public void ajoutePlante(Plante plante)
	   {
		   if(nbrPLantes<inventaire.length)
		   {
			   inventaire[nbrPLantes]=plante;
			   nbrPLantes++;
		   }
		   else
			   System.out.println("impossible d'ajouter une plante");
	   }
	   public void afficherInventaire()
	   {
		   for(int i=0;i<nbrPLantes;i++)
			{
				System.out.println(inventaire[i]);
			} 
	   }
	   public double totalAbsorptionTotaleCO2()
	   {
		  double s=0;
		  for(int i=0;i<nbrPLantes;i++)
		  {
			  if(inventaire[i] instanceof Arbre) {
				  s=s+(((Arbre)inventaire[i]).absorptionCO2());
			  }
		  }
		  return s;
	   }
	   public int  CompterArbresCaduques()
	   {
		   int count=0;
		   for(int i=0;i<nbrPLantes;i++)
		   {
			   if(inventaire[i] instanceof Arbre)
				   if("caduque".equalsIgnoreCase(((Arbre)inventaire[i]).getType_feuillage()))
					   count++;
					   
		   }
		   return count;
	   }
	   
	   
	   
}
