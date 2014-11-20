package com.sdz.marques;

import java.io.Serializable;
import java.util.List;

import com.sdz.options.Option;



public class Lagouna extends Vehicule implements Serializable {
	public Lagouna(){

		super(Marque.RENO,"Lagouna");
	}
	
//	public Lagouna(double prix,String nom,List<Option> options){
//		super(prix,nom,options,Marque.RENO);
//	}
	public String toString(){
		 return super.ToString();
	}
}
