package Polimorfismo;

public class Coche extends Vehiculo{
	private String marca;
	private int id;
	private String color;
	private boolean disponible;
	
	public Coche(String marca, int id, String color, boolean disponible) {
		super();
		this.marca = marca;
		this.id = id;
		this.color = color;
		this.disponible = disponible;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	// Sobrescritura
	public void moverse(){
		System.out.println("Me estoy moviendo en carretera");
	}
	//Sobrecarga
	
	
	
}
