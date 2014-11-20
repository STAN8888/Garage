package com.sdz.options;

import java.io.Serializable;


public class GPS implements Option,Serializable{
	double prix;
    public GPS(){
    	prix=113.5;
    } 
	@Override
	public Double getPrix() {
		return 113.5;
	}
	public String toString(){
		return "GPS (" + prix + "euro)";
	}
}
