package model;

public class Noeud {

	Stagiaire stagiaire;
	Noeud filsGauche;
	Noeud filsDroit;
	
	
	public Noeud(Stagiaire stagiaire, Noeud filsGauche, Noeud filsDroit) {
		super();
		this.stagiaire = stagiaire;
		this.filsGauche = filsGauche;
		this.filsDroit = filsDroit;
	}
	@Override
	public String toString() {
		return "Noeud [stagiaire=" + stagiaire + ", filsGauche=" + filsGauche + ", filsDroit=" + filsDroit + "]";
	}
	public Stagiaire getStagiaire() {
		return stagiaire;
	}
	public void setStagiaire(Stagiaire stagiaire) {
		this.stagiaire = stagiaire;
	}
	public Noeud getFilsGauche() {
		return filsGauche;
	}
	public void setFilsGauche(Noeud filsGauche) {
		this.filsGauche = filsGauche;
	}
	public Noeud getFilsDroit() {
		return filsDroit;
	}
	public void setFilsDroit(Noeud filsDroit) {
		this.filsDroit = filsDroit;
	}
	public void ajouterNoeud(Stagiaire s) {
		// TODO Auto-generated method stub
		
	}
	public void ajouterStagiaire(Stagiaire stagiaire) {
		// TODO Auto-generated method stub
		
	}
}
	

