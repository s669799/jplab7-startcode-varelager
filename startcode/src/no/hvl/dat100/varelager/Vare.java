package no.hvl.dat100.varelager;

public class Vare {

	// TODO - objektvariable
	private int varenr = 0;
	private String navn = "";
	private double pris = 0.0;

	public Vare(int varenr, String navn, double pris) {
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
	}

	public int getVarenr() {
		return varenr;
	}

	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	public double beregnMoms() {
		return pris / 100 * 20;

	}

	public String toString() {
		return "Vare [varenr=" + varenr + ", navn=" + navn + ", pris=" + pris + "]";
		
	}

	public boolean erBilligereEnn(Vare v) {
		return (this.pris < v.pris);
	}
}
