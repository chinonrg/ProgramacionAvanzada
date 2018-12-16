package database;

public class Cuenta {
	
	private final int id;
	private int nip;
	private double balance;
	
	public Cuenta(int id) {
		this.id=id;
	}
	public Cuenta(int num, int nip, double b) {
		this.id = num;
		this.nip = nip;
		this.balance = b;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", nip=" + nip + ", balance=" + balance + "]";
	}
	
	
}
