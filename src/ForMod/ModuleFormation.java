package ForMod;


public class ModuleFormation {
	public ModuleFormation (){}
	
	private Module module;
	private Double nbHeure; 
	
	
	public ModuleFormation (Module module){
		Double nbHeure = null;
		this.module = module;
		this.nbHeure = nbHeure; 
	}


	public Module getModule() {
		return module;
	}


	public void setModule(Module module) {
		this.module = module;
	}


	public Double getNbHeure() {
		return nbHeure;
	}


	public void setNbHeure(Double nbHeure) {
		this.nbHeure = nbHeure;
	}

	
	
}
