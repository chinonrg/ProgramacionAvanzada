package bank;
import database.Cuenta;

public abstract class Operacion {

	private Cuenta cuenta;
	protected static int idOperacion = 0;
	
	
	public static int getIdOperacion() {
		return idOperacion;
	}

	public static void setIdOperacion(int idOperacion) {
		Operacion.idOperacion = idOperacion;
	}


	@Override
	public String toString() {
		return "Operacion [cuenta=" + cuenta + "]";
	}
	
	
}
