package Modele.Initialisation;

import java.util.ArrayList;

import Modele.ForMod.*;



//Remplacer la classs essai par une class Initialisation.

    public class Insert {
	 

	public static Formation Inserer() {
		
		//Module1
		String Module1_nom = "Programmation orientee objet Java";
		String Module1_abb = "Java";
		String Module1_couleur = "Vert";
		int Module1_nbSeance=  12;
		Module Module1 = new Module(Module1_nom,Module1_abb,Module1_couleur,Module1_nbSeance);
		
		//Module2
		String Module2_nom = "Base De Donnée";
		String Module2_abb = "BD";
		String Module2_couleur = "Bleu";
		int Module2_nbSeance = 10;
		Module Module2 = new Module(Module2_nom,Module2_abb,Module2_couleur,Module2_nbSeance);
		
		//Double nbHeure1 = 0.0; 
		//Double nbHeure2 = 0.0; 
		String Module3_nom = "Anglais";
		String Module3_abb = "Ang";
		String Module3_couleur = "Rouge";
		int Module3_nbSeance = 5;
		Module Module3 = new Module(Module3_nom,Module3_abb,Module3_couleur,Module3_nbSeance);
                
                String Module4_nom = "Comptabilité";
		String Module4_abb = "Compta";
		String Module4_couleur = "Jaune";
		int Module4_nbSeance = 10;
		Module Module4 = new Module(Module4_nom,Module4_abb,Module4_couleur,Module4_nbSeance);
                
                String Module5_nom = "Marketing";
		String Module5_abb = "Mrg";
		String Module5_couleur = "Rose";
		int Module5_nbSeance = 5;
		Module Module5 = new Module(Module5_nom,Module5_abb,Module5_couleur,Module5_nbSeance);
                
                String Module6_nom = "Réseaux";
		String Module6_abb = "Rsx";
		String Module6_couleur = "Violet";
		int Module6_nbSeance = 10;
		Module Module6 = new Module(Module6_nom,Module6_abb,Module6_couleur,Module6_nbSeance);
                
		ModuleFormation Module_Formation1 =  new ModuleFormation(Module1);
		ModuleFormation Module_Formation2 = new ModuleFormation(Module2);
                ModuleFormation Module_Formation3 = new ModuleFormation(Module3);
		ModuleFormation Module_Formation4 = new ModuleFormation(Module4);
                ModuleFormation Module_Formation5 = new ModuleFormation(Module5);
                ModuleFormation Module_Formation6 = new ModuleFormation(Module6);
		//Formation
		
		String Formation_nom = "Licence MIAGE 3ème année";
		Double Formation_duree= (double) 4;
			
		
		ArrayList<ModuleFormation> tabModule = new ArrayList<>();
		tabModule.add(Module_Formation1);
		tabModule.add(Module_Formation2);
                tabModule.add(Module_Formation3);
                tabModule.add(Module_Formation4);
		tabModule.add(Module_Formation5);
                tabModule.add(Module_Formation6);
        Formation L3 = new Formation(Formation_nom,Formation_duree,tabModule);
    return L3;
    
    
   
    
	
	
}
        
         public static Formation InserModule(ModuleFormation module){
     Formation formation = Inserer();
    formation.getTabModule().add(module);
    return formation;
        
    }
    }