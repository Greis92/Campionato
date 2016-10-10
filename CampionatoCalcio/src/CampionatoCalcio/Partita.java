package CampionatoCalcio;

import java.util.Date;

public class Partita {
	
	//ATTRIBUTI
	private Date data = new Date();
	private String squadraCasa;
	private String squadraOspite;
	private int retiDellaSquadraCasa;
	private int retiDellaSquadraOspite;
	private char risultato;
	
	//COSTRUTTORE VUOTO
	public Partita() {
	}
	
	//COSTRUTTORE OGGETTO
	public Partita(Date data, String squadraCasa, String squadraOspite,
			int retiDellaSquadraCasa, int retiDellaSquadraOspite, char risultato) {
		this.data = data;
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		this.retiDellaSquadraCasa = retiDellaSquadraCasa;
		this.retiDellaSquadraOspite = retiDellaSquadraOspite;
		this.risultato = risultato;
	}
	
	//METODI GET E SET
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getSquadraCasa() {
		return squadraCasa;
	}

	public void setSquadraCasa(String squadraCasa) {
		this.squadraCasa = squadraCasa;
	}

	public String getSquadraOspite() {
		return squadraOspite;
	}

	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}

	public int getRetiDellaSquadraCasa() {
		return retiDellaSquadraCasa;
	}

	public void setRetiDellaSquadraCasa(int retiDellaSquadraCasa) {
		this.retiDellaSquadraCasa = retiDellaSquadraCasa;
	}

	public int getRetiDellaSquadraOspite() {
		return retiDellaSquadraOspite;
	}

	public void setRetiDellaSquadraOspite(int retiDellaSquadraOspite) {
		this.retiDellaSquadraOspite = retiDellaSquadraOspite;
	}

	public char getRisultato() {
		return risultato;
	}

	public void setRisultato(char risultato) {
		this.risultato = risultato;
	}
	
	public String toString(){
		String str ="";
		str = str + squadraCasa + " " + squadraOspite
				+ " " + retiDellaSquadraCasa + " " + retiDellaSquadraOspite
				+ " " + risultato;
		return str;
	}
	
	
	
	
	
	

}
