package database;

public class Cliente {
	
	private String nombre;
	private int numeroCuenta, nip;
	private double balance;
	
	private Cuenta cuenta = new Cuenta(balance, numeroCuenta, nip);
	
	public Cliente(String n, int nc, int nip, double balance) {
		this.nombre = n;
		this.numeroCuenta = nc;
		this.nip = nip;
		this.balance = balance;
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
	
	public Cuenta verCuenta() {
		return cuenta;
	}
}
