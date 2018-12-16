package database;

public class Cuenta {
	
	private double balance;
	private int id;
	private int nip;
	
	public Cuenta(double b, int id, int nip) {
		this.balance = b;
		this.id = id;
		this.nip = nip;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Cuenta [balance=" + balance + "]";
	}

	
	
	
}
