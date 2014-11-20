package com.sdz.options;

import java.io.Serializable;


public class SiegeChauffant implements Option,Serializable{
	double prix;
    public SiegeChauffant(){
    	prix=562.9;
    } 
	@Override
	public Double getPrix() {
		return 562.9;
	}
	public String toString(){
		return "siege chauffant (" + prix + "euro)";
	}
}
