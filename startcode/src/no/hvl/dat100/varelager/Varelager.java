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
			varer[antall] = v;
			lagtTil = true;
			antall++;
		}
		return lagtTil;

	}

	public boolean leggTil(int varenr, String navn, double pris) {

		Vare a = new Vare(varenr, navn, pris);
		return leggTilVare(a);
	}

	public Vare finnVare(int varenr) {

		int i = 0;
		boolean funnet = false;
		Vare svar = null;

		while (i < varer.length && !funnet) {
			if (varenr == varer[i].getVarenr()) {
				svar = varer[i];
			}
			i++;
		}
		return svar;

	}

	private String SEP = "==============================";

	public void printVarelager() {

		System.out.println(SEP);
		for (int i = 0; i < varer.length; i++) {
			System.out.println(varer[i].toString());
		}
		System.out.println(SEP);
	}

}
