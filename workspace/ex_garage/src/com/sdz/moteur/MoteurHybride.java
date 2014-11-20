package com.sdz.moteur;

import java.io.Serializable;


public class MoteurHybride extends Moteur implements Serializable {
	public MoteurHybride(String cyl, double prix){
		super(cyl,prix,TypeMoteur.HYBRIDE);
	}
//	private TypeMoteur type;
//	public void settype (TypeMoteur type){
//		type=TypeMoteur.HYBRIDE;
//	}
    
}
