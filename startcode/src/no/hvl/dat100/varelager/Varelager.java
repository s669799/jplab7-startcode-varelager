package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;

	public Varelager(int n) {

		varer = new Vare[n];
		antall = 0;

	}

	public Vare[] getVarer() {

		return varer;

	}

	public boolean leggTilVare(Vare v) {
		
		boolean lagtTil = false;
		if (antall < varer.length) {
			varer[antall + 1] = v;
			lagtTil = true;
		}
		antall++;
		return lagtTil;

	}

	public boolean leggTil(int varenr, String navn, double pris) {

		throw new TODO("leggTil");

	}

	public Vare finnVare(int varenr) {

		throw new TODO("finnVare");

	}

	private String SEP = "==============================";

	public void printVarelager() {

		throw new TODO("printVarelager");

	}

}
