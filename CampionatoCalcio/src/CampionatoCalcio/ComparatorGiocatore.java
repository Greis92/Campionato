package CampionatoCalcio;

import java.util.Comparator;



public class ComparatorGiocatore implements Comparator<Giocatore> {

	@Override
	public int compare(Giocatore o1, Giocatore o2) {
		
		int valReti = o2.getReti()- o1.getReti();
		if (valReti==0) {
			int valAmmoniti = o1.getAmmonizioni() - o2.getAmmonizioni();
			if (valAmmoniti==0) {
				int valEspulsi = o1.getEspulsioni() - o2.getEspulsioni();
				return valEspulsi;
			}else {
				return valAmmoniti;
			}
		}else {
			return valReti;
		}
	}
	
}
