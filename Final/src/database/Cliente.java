package database;

public class Cliente {
	
	private String nombre;
	private Cuenta cuenta;
	
	public Cliente(Cuenta c, String n) {
		this.nombre = n;
		this.cuenta = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + "]";
	}
	
	
}
