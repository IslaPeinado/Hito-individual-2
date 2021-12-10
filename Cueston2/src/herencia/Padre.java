package herencia;

//Para que no se pueda instanciar(Crear padre1, padre2...) he puesto que sea absrtracto; porque abstracto hace que no sea instanciado. 

abstract class Padre {
	//Atributo
	public String texto;
	public int numero;
	
	//Constructor
	public Padre(String texto, int numero) {
		super();
		this.texto = texto;
		this.numero = numero;
	}
	
	//Metodo 	 //Void devuelve un mensaje
	public void Saludar() {
		System.out.println("Hola, soy el padre.");
	}

}
