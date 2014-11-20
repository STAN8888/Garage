import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sdz.marques.Vehicule;

public class Garage implements Serializable {
	ObjectInputStream ois;
    ObjectOutputStream oos;
	List<Vehicule> voitures= new ArrayList<Vehicule>();
	File garage=new File("Garage.txt");
	public Garage(){
		this.readVoiture();
	}
	public void addVoiture(Vehicule voit) {
		voitures.add(voit);	
		try{
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(garage)));
             
            for(Vehicule V:voitures){
                oos.writeObject(V);
            }
            oos.close();
 
        }catch(FileNotFoundException e){
       
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Aucune voiture sauvegardé");
        }
	}
		public void readVoiture() {
			try{
	            ois = new ObjectInputStream(
	                    new BufferedInputStream(
	                            new FileInputStream(garage)));
	                                  
	 
	            try{
	                System.out.println("Affichage des voitures :");
	                System.out.println("*************************\n");
	                System.out.println(((Vehicule)ois.readObject()).toString());
	     
	            }catch (ClassNotFoundException e) {
	                e.printStackTrace();
	                System.out.println("garage vide");
	            }
	 
	        }catch(FileNotFoundException e){
	            e.printStackTrace();
	            System.out.println("Aucune voiture sauvegardé");
	        }catch (IOException e){
	            e.printStackTrace();
	            System.out.println("Aucune voiture sauvegardé");
	        }
		}
	     
	  public String ToString(){
		System.out.println("Garage openclassroom");
		return "Garage OpenCassroom";
	  }
    }
     
