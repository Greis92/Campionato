package CampionatoCalcio;

import java.util.Date;
import java.util.HashMap;

public class Campionato {
	
	//ATTRIBUTI
	private String nome;
	private HashMap<String,Giocatore> mappaGiocatori = new HashMap<String,Giocatore>();
	private HashMap<String,Squadra> mappaSquadre = new HashMap<String,Squadra>();
	private HashMap<Date,Partita> mappaPartite = new HashMap<Date,Partita>();
	
	//COSTRUTTORE VUOTO
	public Campionato() {
	}
	
	//COSTRUTTORE OGGETTO
	public Campionato(String nome) {
		this.nome = nome;
	}
	
	//METODI GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HashMap<String, Giocatore> getMappaGiocatori() {
		return mappaGiocatori;
	}

	public void setMappaGiocatori(HashMap<String, Giocatore> mappaGiocatori) {
		this.mappaGiocatori = mappaGiocatori;
	}

	public HashMap<String, Squadra> getMappaSquadre() {
		return mappaSquadre;
	}

	public void setMappaSquadre(HashMap<String, Squadra> mappaSquadre) {
		this.mappaSquadre = mappaSquadre;
	}

	public HashMap<Date, Partita> getMappaPartite() {
		return mappaPartite;
	}

	public void setMappaPartite(HashMap<Date, Partita> mappaPartite) {
		this.mappaPartite = mappaPartite;
	}
	
	
	
	
	
	
	
}
