package Polimorfismo;

public abstract class Vehiculo {
	public void moverse(){
		System.out.println("Me estoy moviendo ");
	}
	public void rgasolina() {		//recargar gasolina
		System.out.println("Se esta recargando la gasolina ");
	}
	public void rgasolina(double porcentaje) {		//recargar gasolina
		System.out.println("Se esta recargando la gasolina al "+ porcentaje  + " %");
	}
}
