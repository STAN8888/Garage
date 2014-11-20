package com.sdz.moteur;

import java.io.Serializable;


public class MoteurDiesel extends Moteur implements Serializable {
	public MoteurDiesel(String cyl, double prix){
		super(cyl,prix,TypeMoteur.DIESEL);
	}
//	private TypeMoteur type;
//	public void settype (TypeMoteur type){
//		type=TypeMoteur.DIESEL;
//	}
    
}
