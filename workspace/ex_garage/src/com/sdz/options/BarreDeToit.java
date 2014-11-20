package com.sdz.options;

import java.io.Serializable;


public class BarreDeToit implements Option,Serializable {
	double prix;
    public BarreDeToit(){
    	prix=29.9;
    } 
	@Override
	public Double getPrix() {
		return 29.9;
	}
	public String toString(){
		return "barre de toit (" + prix + "euro)";
	}
}
