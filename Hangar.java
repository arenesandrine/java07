package wildcodeschool.java07;

import java.util.ArrayList;



public class Hangar {

	public static void main(String[] args) { 
		
		
		Car nissan = new Car ("nissan");   // ajout de références
		Car fiat = new Car ("fiat");
		Car bmw = new Car ("bmw");
		Boat titanic = new Boat ("Titanic");
		Boat france = new Boat ("france");
		Boat costa = new Boat ("costa");
		
	
    
    	ArrayList<Vehicule1> vehiculesList = new ArrayList<>();
    	vehiculesList.add(nissan);
    	vehiculesList.add(fiat);
    	vehiculesList.add(bmw);
    	vehiculesList.add(titanic);
    	vehiculesList.add(costa);
    	vehiculesList.add(france);
    	
    	// parcours de la liste
    	for (Vehicule1 vehicule : vehiculesList) {
    		System.out.println("Je suis " + vehicule.getbrand() + " et je fais " + vehicule.doStuff());
    
    	}
	}

}
public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
