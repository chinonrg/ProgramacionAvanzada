package bank;

import database.Cuenta;

public class Extraccion extends Operacion{
		
	private double montoExt;
	public Extraccion() {}
	public Extraccion(Cuenta cuenta, double monto) {
		montoExt = cuenta.getBalance() - monto;
		System.out.println("Se ha extraído de su cuenta $" + monto);
		cuenta.setBalance(montoExt);
		System.out.println("El balance de su cuenta es $" + montoExt);
		idOperacion++;
	}
	
}