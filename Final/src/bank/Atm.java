package bank;

import database.*;

public class Atm {
	
	private Cliente cl;
	private int billetes = 500;
	private boolean ranura = false;
	private boolean estadoBanco = false;
	//private double dispenser;
	private String nombreBanco;
	
	public Atm() {}
	public Atm (String nombre) {
		this.nombreBanco = nombre;
	}
	public Cliente getCl() {
		return cl;
	}
	public void setCl(Cliente cl) {
		this.cl = cl;
	}
	public int getBilletes() {
		return billetes;
	}
	public void setBilletes(int billetes) {
		this.billetes = billetes;
	}
	public boolean isRanura() {
		return ranura;
	}
	public void setRanura(boolean ranura) {
		this.ranura = ranura;
	}
	public boolean isEstadoBanco() {
		return estadoBanco;
	}
	public void setEstadoBanco(boolean estadoBanco) {
		this.estadoBanco = estadoBanco;
	}
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	
	
}
