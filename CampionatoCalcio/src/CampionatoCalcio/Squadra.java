package CampionatoCalcio;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
	
	//ATTRIBUTI
	private String nome;
	private String codiceSquadra;
	private int punti;
	private int retiSubiti;
	private int retiFatti;
	private int differenzaReti;
	private List<Giocatore> giocatoriDellaSquadra = new ArrayList<Giocatore>();
	
	//COSTRUTTORE VUOTO
	public Squadra() {
	}
	
	//COSTRUTTORE OGGETTO
	public Squadra(String nome, String codiceSquadra){
		this.nome = nome;
		this.codiceSquadra = codiceSquadra;
	}
	
	// METODI GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodiceSquadra() {
		return codiceSquadra;
	}

	public void setCodiceSquadra(String codiceSquadra) {
		this.codiceSquadra = codiceSquadra;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public int getRetiSubiti() {
		return retiSubiti;
	}

	public void setRetiSubiti(int retiSubiti) {
		this.retiSubiti = retiSubiti;
	}

	public int getRetiFatti() {
		return retiFatti;
	}

	public void setRetiFatti(int retiFatti) {
		this.retiFatti = retiFatti;
	}

	public int getDifferenzaReti() {
		return differenzaReti;
	}

	public void setDifferenzaReti(int differenzaReti) {
		this.differenzaReti = differenzaReti;
	}
	
	public List<Giocatore> getGiocatoriDellaSquadra() {
		return giocatoriDellaSquadra;
	}

	public void setGiocatoriDellaSquadra(List<Giocatore> giocatoriDellaSquadra) {
		this.giocatoriDellaSquadra = giocatoriDellaSquadra;
	}

	//METODO TOSTRING SQUADRE
	public String toString(){
		String str = "";
		str = nome+" ";
		return str;
	}
	
	//METODO TOSTRING GIOCATORI DELLA SQUADRA
	public String toStringGiocatoriDellaSquadra(){
		String str = "";
		for(Giocatore g : giocatoriDellaSquadra){
			str = str + g.toString();
		}
		return str;
	}

	
	

	
	

}
