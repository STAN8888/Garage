package com.sdz.marques;

import java.io.Serializable;
import java.util.List;

import com.sdz.options.Option;


public class A300B extends Vehicule implements Serializable {
	public A300B(){
		super(Marque.PIGEOT,"A330B");
	}
//	public A300B(double prix,String nom,List<Option> options){
//		super(prix,nom,options,Marque.PIGEOT);
//	}
	public String toString(){
		 return super.ToString();
	}
}