package source;

import java.util.ArrayList;

import ForMod.*;



//Remplacer la classs essai par une class Initialisation.

    public class Insert {
	 

	public static Formation Inserer() {
		
		//Module1
		String Module1_nom = "Programmation orientee objet Java";
		String Module1_abb = "Java";
		String Module1_couleur = "Noir";
		int Module1_nbSeance=  5;
		Module Module1 = new Module(Module1_nom,Module1_abb,Module1_couleur,Module1_nbSeance);
		
		//Module2
		String Module2_nom = "Base De Donnee";
		String Module2_abb = "BD";
		String Module2_couleur = "Bleu";
		int Module2_nbSeance = 10;
		Module Module2 = new Module(Module2_nom,Module2_abb,Module2_couleur,Module2_nbSeance);
		
		//Double nbHeure1 = 0.0; 
		//Double nbHeure2 = 0.0; 
		
		ModuleFormation Module_Formation1 =  new ModuleFormation(Module1);
		ModuleFormation Module_Formation2 = new ModuleFormation(Module2);
	
		
		//Formation
		
		String Formation_nom = "Licence 3eme annee";
		Double Formation_duree= (double) 4;
			
		
		ArrayList<ModuleFormation> tabModule = new ArrayList<ModuleFormation>();
		tabModule.add(Module_Formation1);
		tabModule.add(Module_Formation2);

		
        Formation L3 = new Formation(Formation_nom,Formation_duree,tabModule);
    return L3;
	}
	
}
