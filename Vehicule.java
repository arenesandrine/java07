package wildcodeschool.java07;

public abstract class Vehicule {
	
	private String brand;  // attributs
	private int kilometers;
	
	
	public Vehicule(){  // constructeur permettant d'initialiser les attributs
		
		
	}
	
		 public Vehicule (String brand) {
		        this.brand = brand;
		        this.kilometers = 0;
		    
		 }
		 

	 public void setbrand(String brand)// set et get de brand
      {
       this.brand = brand;
     } 
 
      public String getbrand()
      { 
    	  return this.brand;
      }  
	


      public void setkilometers(int kilometers) // set et get de kilometers
	     {
	        this.kilometers = kilometers;
	      } 
	 
	      public int getkilometers()
	      {
	    	  return this.kilometers;
	      }
	      
	      
	        public abstract String doStuff();    // méthode "faire quelque chose"
	         
				
}
