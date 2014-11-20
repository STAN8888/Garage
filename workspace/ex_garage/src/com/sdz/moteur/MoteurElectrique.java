package com.sdz.moteur;

import java.io.Serializable;


public class MoteurElectrique extends Moteur implements Serializable {
	public MoteurElectrique(String cyl, double prix){
		super(cyl,prix,TypeMoteur.ELECTRIQUE);
	}
	//private TypeMoteur type;
	//public void settype (TypeMoteur type){
	//	type=TypeMoteur.ELECTRIQUE;
	//}
    
}
