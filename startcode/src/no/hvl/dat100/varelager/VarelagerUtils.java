package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {

		double billig = Double.MAX_VALUE;
		Vare billigst = null;

		for (int i = 0; i < varer.length; i++) {
			if (billig > varer[i].getPris()) {
				billig = varer[i].getPris();
				billigst = varer[i];
			}	
		}
		return billigst;
	}

	public static double totalPris(Vare[] varer) {

		double sum = 0.0;
		
		for (int i = 0; i < varer.length; i++ ) {
			sum += varer[i].getPris();
		}
		return sum;
	}

	public static int[] finnVarenr(Vare[] varer) {

		int[] varenr = new int[varer.length];
		
		for (int i = 0; i < varenr.length; i++) {
			varenr[i] = varer[i].getVarenr();
		}
		return varenr;
	}

	public static double[] finnPrisDifferanser(Vare[] varer) {

		double[] prisDiff = new double[varer.length-1];
		
		for (int i = 0; i < prisDiff.length; i++) {
			prisDiff[i] = varer[i+1].getPris() - varer[i].getPris();	
		}
		return prisDiff;
	}
}
