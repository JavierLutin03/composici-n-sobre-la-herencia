package carro;

public class Persona {
	
	
	Carro metodoTransporte; 

	public static void main(String[] args) {

		Persona p = new Persona (); 
		CarroGasolina cg = new CarroGasolina("AA", "aa");
		CarroElectrico ce = new CarroElectrico("BB", "bb");
		
		System.out.println(p.metodoTransporte); 
		
	
	}

}
