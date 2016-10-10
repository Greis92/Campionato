package CampionatoCalcio;

import java.util.Comparator;

public class SquadraComparator implements Comparator<Squadra> {
	
	Campionato c;
	
	public SquadraComparator(Campionato c){
		this.c=c;
	}
	
	@Override
	public int compare(Squadra s1, Squadra s2) {
		int valPunti=s2.getPunti()-s1.getPunti();
		if(valPunti==0){
			int valDifferenzaReti=s1.getDifferenzaReti()-s2.getDifferenzaReti();
			return valDifferenzaReti;
		}
		return valPunti;
	}
	
}