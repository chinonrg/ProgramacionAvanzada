package bank;
import database.*;

public class Deposito extends Operacion {
	private double montoDep;
	public Deposito() {}
	public Deposito(Cuenta cuenta, double monto) {
		montoDep = cuenta.getBalance() + monto;
		System.out.println("Se ha depositado $" + monto);
		cuenta.setBalance(montoDep);
		System.out.println("El balance de su cuenta es $" + montoDep);
		idOperacion++; 
	}
}
