package info;

public class Trabajador {
	
//Atributos
	public String nombre;
	public String ciudad;
	public float salarioBruto;
	public boolean contratoTemporal;
	
	
	
//constructor
	public Trabajador(String nombre, String ciudad, float salarioBruto, boolean contratoTemporal) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.salarioBruto = salarioBruto;
		this.contratoTemporal = contratoTemporal;
	}



//Get(leer)/set(añadir info)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public boolean isContratoTemporal() {
		return contratoTemporal;
	}

	public void setContratoTemporal(boolean contratoTemporal) {
		this.contratoTemporal = contratoTemporal;
	}
	
	
	
//Metodos
	public void trabajar() {
		System.out.println("Estoy trabajando");
	}
	
	
	
}//cierra la clase
