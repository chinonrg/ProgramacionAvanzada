package bank;

public class Bank {
	private Atm atm;
	
	public void cierreBanco(Atm atm) {
		atm.setBilletes(0);
	}
	public void aperturaBanco(Atm atm) {
		atm.setBilletes(500);
	}
}
