package com.sdz.marques;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sdz.moteur.Moteur;
import com.sdz.options.Option;


public class Vehicule implements Serializable{
	private Moteur typeMoteur;
	private double prix;
	private String nom;
	private Marque nomMarque;
	private List<Option> options= new ArrayList<Option>();
	
	//constructeur
	public Vehicule(){
	}
	public Vehicule(Marque marque, String name){
		nomMarque=marque;
		nom=name;
	}
	//public Vehicule(double prix, String nom, List<Option> options, Marque marque) {
	//	this.nom=nom;
	//	this.prix=prix;
	//	this.options=options;
	//	nomMarque=marque;
	//}
	//public Vehicule(Marque marque) {
	//	nomMarque=marque;
	//}
	public Double getPrix(){
		return this.prix; 
	}
	public double getPrixOptions(){
		double prixOptions=0;
		for(int i=0;i<this.options.size();i++){
			prixOptions += this.options.get(i).getPrix();
		}
		return prixOptions;
		
	}
	public String ToString(){
		return"+ Voiture " + nomMarque.toString() + " : " + nom + " " + typeMoteur
				+ options + " d'une valeur totale de " ;
	}
	public Marque getMarque(){
		return nomMarque;
	}
	public void setMoteur(Moteur moteur) {
		typeMoteur=moteur;
	}
	public void addOption(Option opt){
		this.options.add(opt);
	}
	public List<Option> getOptions (){
		return options;
	}
}
