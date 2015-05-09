package Modele.ForMod;


import java.util.ArrayList;

   public class Formation {
	
	public Formation (){}
	   
		private String nom;
		private Double  dureeSeance;
		private ArrayList<ModuleFormation> tabModule;
		
		
		//private Double[] tabNbHeure; //Utilisation du Double 0,5 = 30mn !!! pas la bonne solution (Time)
		int nbSeance;
	     
    public Formation(String nom,Double  dureeSeance,ArrayList<ModuleFormation> tabModule){
	  
		  this.nom = nom;
		  this.dureeSeance=dureeSeance;
		  this.tabModule=tabModule;
		  
	  }
	//Gertters and Setters 
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Double getDureeSeance() {
		return dureeSeance;
	}
	
	public void setDureeSeance(Double dureeSeance) {
		this.dureeSeance = dureeSeance;
	}
	
	public ArrayList<ModuleFormation> getTabModule() {
		
		for (int i = 0;i<tabModule.size();i++){
			nbSeance =  tabModule.get(i).getModule().getNbSeance();
			tabModule.get(i).setNbHeure(( (double) nbSeance) * getDureeSeance());
		}
		
		return tabModule;
	}
	
	public void setTabModule(ArrayList<ModuleFormation> tabModule) {
		this.tabModule = tabModule;
	}
	
	public int DureeFormation(){
		int cmpt = 0;
	
		for (int i = 0;i<getTabModule().size();i++){
		
				cmpt = (int) (cmpt + getTabModule().get(i).getNbHeure());
			
	}
		return cmpt;
	}
	
	
	
	public int NbJourFormation(int dureeFormation){
		
		int cmpt = 0;
		while (dureeFormation>=7){
			dureeFormation=dureeFormation-7;
			cmpt = cmpt+1;
		}
		return cmpt;
	}
	
	public int NbHeureFormation(int dureeFormation){
		int cmpt = 0;
		
		while (dureeFormation>=7){
			dureeFormation=dureeFormation-7;
			cmpt = cmpt+1;
		}
		return dureeFormation;
	}
	
	

	//test Ajout (test de  Nom)
        public int testNom(String nom){
		int cmpt = 0;
		for (int i = 0;i<tabModule.size();i++){
			if( getTabModule().get(i).getModule().getNom().equals(nom)) {
				cmpt ++;
			}
	}
		return cmpt;
	}
     
   
	
	
	//test Ajout  (test d'ABB)
	public int testAbbrev(String abbrev){
		int cmpt = 0;
		for (int i = 0;i<tabModule.size();i++){
			if( getTabModule().get(i).getModule().getAbbrev().equals(abbrev) ) {
				cmpt ++;
			}
	}
		return cmpt;
	}
	
	
	//test Ajout (test couleur)
	public int testCouleur(String couleur){
		int cmpt = 0;
		for (int i = 0;i<tabModule.size();i++){
			if( getTabModule().get(i).getModule().getNom().equals(couleur)) {
				cmpt ++;
			}
	}
		return cmpt;
	}
	
	
	//test Update (test de  Nom)
        public int testUpdateNom(String nomSelected,String nom){
		int cmpt = 0;
		for (int i = 0;i<tabModule.size();i++){
                if (!getTabModule().get(i).getModule().getNom().equals(nomSelected)){
			if( getTabModule().get(i).getModule().getNom().equals(nom)) {
				cmpt ++;
			}
	}
                }
		return cmpt;
	}
     
   
	
	
	//test Update  (test d'ABB)
	public int testUpdateAbbrev(String nomSelected,String abbrev){
		int cmpt = 0;
		for (int i = 0;i<tabModule.size();i++){
             if (!getTabModule().get(i).getModule().getNom().equals(nomSelected)){       
			if( getTabModule().get(i).getModule().getAbbrev().equals(abbrev) ) {
				cmpt ++;
			}
	}
                }
		return cmpt;
	}
	
	
	//test Update (test couleur)
	public int testUpdateCouleur(String nomSelected,String couleur){
		int cmpt = 0;
		for (int i = 0;i<tabModule.size();i++){
                       if (!getTabModule().get(i).getModule().getNom().equals(nomSelected)){     
			if( getTabModule().get(i).getModule().getNom().equals(couleur)) {
				cmpt ++;
			}
	}
                }
		return cmpt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   //Affichage des Modules 
	public void afficherLesModules(ArrayList<ModuleFormation> moduleFormation){
		for (int i = 0;i<moduleFormation.size();i++){
			System.out.println("\nle module "+ (i+1));
			moduleFormation.get(i).getModule().afficherModule();
			double j = moduleFormation.get(i).getNbHeure();
			System.out.println(" Duree du module "+ j);
			
		}
	
		
	}
        
        public String afficherDureeFormation(int dureeFormation){
            String msgDureeFormation ;
            if (NbHeureFormation(dureeFormation) != 0 ){
                msgDureeFormation= " Durée de la formation : "+NbJourFormation(DureeFormation())+" jours et "+NbHeureFormation(DureeFormation())+" h.";
		}else{
			msgDureeFormation=(" Durée de la formation : "+NbJourFormation(DureeFormation())+" jours.");
		}
            
            return msgDureeFormation;
        }
        
	//Affichage de la formation:
	public void afficherFormation(){
		System.out.println(" \nLa Formation : "+getNom());
		double i =  getDureeSeance();
		System.out.println("Duree type d'une seance "+ i);
		
		if (NbHeureFormation(DureeFormation()) != 0 ){
		System.out.println(" Duree de la formation : "+NbJourFormation(DureeFormation())+" jours et "+NbHeureFormation(DureeFormation())+" Heures");
		}else{
			System.out.println(" Duree de la formation : "+NbJourFormation(DureeFormation())+" jours.");
		}
		System.out.println(" Les Modules :");
		afficherLesModules(getTabModule());
	}
  
  
}
   