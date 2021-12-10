package herencia;

public class Hija extends Padre {
	//Método //Sobreescribir: Porque el metdodo saludar lo heredamos de padre y cuando va al metodo hija lo vuelve a escribir cambiando el mensaje.
	public void Saludar() {
		System.out.println("Hola, soy la hija.");
	}

	//Constructor
	public Hija(String texto, int numero) {
		super(texto, numero);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
