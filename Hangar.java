package wildcodeschool.java07;

import java.util.ArrayList;



public class Hangar {

	public static void main(String[] args) { 
		
		
		Car nissan = new Car ("nissan");   // ajout de r�f�rences
		Car fiat = new Car ("fiat");
		Car bmw = new Car ("bmw");
		Boat titanic = new Boat ("Titanic");
		Boat france = new Boat ("france");
		Boat costa = new Boat ("costa");
		
	
    
    	ArrayList<Vehicule> vehiculesList = new ArrayList<>();
    	vehiculesList.add(nissan);
    	vehiculesList.add(fiat);
    	vehiculesList.add(bmw);
    	vehiculesList.add(titanic);
    	vehiculesList.add(costa);
    	vehiculesList.add(france);
    	
    	// parcours de la liste
    	for (Vehicule vehicule : vehiculesList) {
    		System.out.println("Je suis " + vehicule.getbrand() + " et je fais " + vehicule.doStuff() + "!");
    
    	}
        System.out.println(nissan.doStuff());
        System.out.println(france.doStuff());
        
        System.out.println("V�hicules de la liste : ");
        
    	// parcours de la liste
    	for (Vehicule vehicule : vehiculesList) {
    		System.out.println("- " + vehicule.getbrand());
    		
    		  
    
    	}
	}

}

