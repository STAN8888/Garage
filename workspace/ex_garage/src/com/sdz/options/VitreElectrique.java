package com.sdz.options;

import java.io.Serializable;


public class VitreElectrique implements Option,Serializable{
	double prix;
    public VitreElectrique(){
    	prix=212.35;
    } 
	@Override
	public Double getPrix() {
		return 212.35;
	}
	public String toString(){
		return "vitre electrique (" + prix + "euro)";
	}
}
