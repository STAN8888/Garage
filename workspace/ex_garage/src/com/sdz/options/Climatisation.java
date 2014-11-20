package com.sdz.options;

import java.io.Serializable;


public class Climatisation implements Option,Serializable{
	double prix;
    public Climatisation (){
    	prix=347.3;
    } 
	@Override
	public Double getPrix() {
		return 347.3;
	}
	public String toString(){
		return "Climatisation (" + prix + "euro)";
	}
}
