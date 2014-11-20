package com.sdz.moteur;

import java.io.Serializable;

import com.sdz.marques.Marque;


public class MoteurEssence extends Moteur implements Serializable {
	   
	 public MoteurEssence(String cyl, double prix){
	        super(cyl,prix,TypeMoteur.ESSENCE);        
	 }
	 
    
}
