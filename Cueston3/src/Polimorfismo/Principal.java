package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//polimorfismo
		Coche coche = new Coche("Seat", 1, "rojo", true);
		coche.moverse();
		coche.rgasolina();
		coche.rgasolina(15.5);
		
		Moto moto = new Moto();
		Coche coche1 = new Coche("Ford", 2, "azul", false);
		Vehiculo [] vehiculos = {coche, moto};
		vehiculos[0].moverse();
		vehiculos[1].moverse();	//polimorfismo basado en herencia (*otro polimorfismo basado en interfaces)	
		
	}

}
