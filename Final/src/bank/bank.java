package bank;

public class bank {
	private Atm atm;
	
	public void cierreBanco(Atm atm) {
		atm.setBilletes(0);
	}
	public void aperturaBanco(Atm atm) {
		atm.setBilletes(500);
	}
}
