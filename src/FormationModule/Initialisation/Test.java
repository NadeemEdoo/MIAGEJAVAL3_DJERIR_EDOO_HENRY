package source;
import ForMod.*;
import java.util.*;




public class Test {
	
	public static void main (String args[]) {
		String nom2;
		    Formation formation = Insert.Inserer() ;
		    int i=1;
		    while (i != 0){
		    System.out.println("\nChoix : ");
	        System.out.println("1-Affichage de la formation et des modules ");
	        System.out.println("2-Modifier des modules");
	        System.out.println("3-Inserer un nouveau Modules");
	        System.out.println("0-Quitter");
	        
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Veuillez saisir votre choix :");
	         int str = sc.nextInt();
	       

	        if (str == 1){
	        	formation.afficherFormation();
	        	System.out.println("\n---------------------------------------------------------------------------------------------------------");
	        }
	        if(str == 2){
	        	 System.out.println("Vous voulez changer : ");
	        	 System.out.println("1-le nom ");
	        	 System.out.println("2-l'abbreviation ");
	        	 System.out.println("3-la Couleur ");
	        	 System.out.println("4-Nombre de seance ");
	        	 
	        	 Scanner sc2 = new Scanner(System.in);
	 	        System.out.println("Veuillez saisir votre choix :");
	 	         int str2 = sc2.nextInt();
	 	       
	 	        
	        switch(str2){
	        case 1:
	        System.out.println("Entez le nouveu nom");	
	        Scanner sc3 = new Scanner(System.in);
 	          String nom = sc3.nextLine();
 	        
 	        
 	         if (formation.testNom(nom) == 0 ) {
 	        formation.getTabModule().get(1).getModule().setNom(nom);
	        System.out.println("Changement du nom effectuer");
	        
	        
 	         }else{
 	        System.out.println("ce nom existe déja");
 	         }
	        break;

	        }
	        System.out.println("\n---------------------------------------------------------------------------------------------------------");
	        }
	       
	        
	        if(str == 3){
	        	System.out.println("Veuillez saisir : ");
	         	 System.out.println("le nom ");
	         	Scanner sc3 = new Scanner(System.in);
	 	         nom2= sc3.nextLine();
	        	
	 	        while(formation.testNom(nom2) != 0)
	 	    {
	 	        	  System.out.println("c3e nom existe déja ! Veuillez saisir le nouveau nom ");
	 	        	 Scanner sc7 = new Scanner(System.in);
		 	         nom2 = sc7.nextLine();
	 	        }
	 	        
	       	  System.out.println("l'abbreviation ");
	       	Scanner sc4 = new Scanner(System.in);
	         String abbrev = sc4.nextLine();
	         
	         while(formation.testAbbrev(abbrev) == 0)
		 	    {
		 	        	  System.out.println("cette abrdev  existe déja ! Veuillez saisir une nouvelle abbreviation  ");
		 	        	 Scanner sc8 = new Scanner(System.in);
		 	        	abbrev = sc8.nextLine();
		 	        }
	         
	       	  System.out.println("la Couleur ");
	       	Scanner sc5 = new Scanner(System.in);
	         String couleur = sc5.nextLine();
	         while(formation.testCouleur(couleur) != 0)
		 	    {
		 	        	  System.out.println("cette Couleur  existe déja ! Veuillez saisir une autre couleur  ");
		 	        	 Scanner sc9 = new Scanner(System.in);
		 	        	couleur= sc9.nextLine();
		 	        }
	         
	       	  System.out.println("Nombre de seance ");
	       	Scanner sc6 = new Scanner(System.in);
	         int nb = sc6.nextInt();
	         
	         
	         Module module3 = new Module(nom2,abbrev,couleur,nb);
	         
	         
	         
	         
	         
	         
	         
	         ModuleFormation Module_Formation3 = new ModuleFormation(module3);
	        formation.getTabModule().add(Module_Formation3)	;
	        formation.afficherFormation();
	        System.out.println("Ajout du module "+ nom2 +" a ete effectuer");
	        System.out.println("\n---------------------------------------------------------------------------------------------------------");
	        }
	    
	        
	        if(str == 0){
	        	  System.out.println("by by :)");
	        	 i = 0;
	        }
	}
	}

}