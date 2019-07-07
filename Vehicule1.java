package wildcodeschool.java07;

public abstract class Vehicule1 {
	
	private String brand;  // attributs
	private int kilometers;
	private boolean son;
	
	public Vehicule1(){  // constructeur permettant d'initialiser les attributs
		
		
	}
	
		 public Vehicule1 (String brand) {
		        this.brand = brand;
		        this.kilometers = 0;
		        this.son = false;
		 }
		 

	 public void setbrand(String brand)// set et get de brand
      {
       this.brand = brand;
     } 
 
      public String getbrand()
      { 
    	  return this.brand;
      }  
	
      public void setson(String son)// set et get de son
      {
       this.son = son;
     } 
 
      public String getson()
      { 
    	  return this.son;
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
