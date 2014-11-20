package com.sdz.moteur;

public abstract class Moteur {
	public Moteur(){
	}
	public Moteur(String cylindre,Double prix, TypeMoteur typeMoteur){
		this.cylindre=cylindre;
		this.prix=prix;
		this.typeMoteur=typeMoteur.toString();
	}
	private String cylindre;
	private Double prix;
	private String typeMoteur;
	
	public void setCylindre(String cylindre){
		this.cylindre=cylindre;
	}
    public void setPrix(Double prix){
		this.prix=prix;
	}	
	public Double getPrix(){
		return prix;
	}
	public String ToString(){
		return typeMoteur+" "+cylindre+" "+prix;
	}
	
}