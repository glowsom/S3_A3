
public class Vehicle {

	public static void main(String[] args) {
		// TODO Constructor Chaining
		Vehicle x = new Vehicle();
		
		Ford sedan = x.new Ford();
		Ford suv = x.new Ford("silver","Edge");
		F_350 dually = x.new F_350(); 

		System.out.println(sedan);
		System.out.println(suv);
		System.out.println(dually);
	}
	
	public class Ford{
		int wheels;
		String color;
		String model;
		
		public Ford(){
			this.model = "vehicle";
			this.color = "white";
			this.wheels = 4;
		}
		public Ford( String color, String model){
			this();
			this.color = color;
			this.model = model;
		}
		public String toString(){
			return "This Ford " + this.model + " is " + this.color + " and has " + wheels + " wheels.";
		}
	}
	
	public class F_350 extends Ford{
		
		public F_350(){
			super();
			super.wheels = 6;
			super.model = "F-350";
		}
	}

}
