package wildcodeschool.java07;


	public class Car extends Vehicule1 {

		public Car (String brand) {  
		    super(brand);  
		    this.setson(true); 
		}
		
		@Override
	    public String son()) {
	        return "vroum vroum!";
		}
		
		
		public String doStuff(){

			return "Je suis " + this.getbrand() + "j'ai" + this.getkilometers() + " de kilomètres et je fais "  + this.son() + " !";

	   	

	   	}
	}

