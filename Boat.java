package wildcodeschool.java07;


	public class Boat extends Vehicule1 {

		public Boat (String brand) {  
		    super(brand);  
		    this.setson(true);
		}
		
		@Override
	    public String son() {
	        return "glou glou!";
		}
		public String doStuff(){

			return "Je suis " + this.getbrand() + ", j'ai " + this.getkilometers() + " de kilomètres et je fais " + this.son() + " !";

	   	}  
	
	}

	
