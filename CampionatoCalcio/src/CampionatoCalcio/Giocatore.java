package CampionatoCalcio;

public class Giocatore {
	
	// ATTRIBUTI
	private String nome;
	private String cognome;
	private String ruolo;
	private double stipendio;
	private int età;
	private int ammonizioni;
	private int espulsioni;
	private int reti;
	private int assist;
	private String codiceFiscale;
	
	// COSTRUTTORE VUOTO
	public Giocatore() {
	}

	// COSTRUTTORE OGGETTO
	public Giocatore(String nome, String cognome,String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	
	// MEOTIDI GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}

	public int getAmmonizioni() {
		return ammonizioni;
	}

	public void setAmmonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}

	public int getEspulsioni() {
		return espulsioni;
	}

	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}

	public int getReti() {
		return reti;
	}

	public void setReti(int reti) {
		this.reti = reti;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	//METODO TOSTRING
	public String toString(){
		String str = nome+" "+cognome+" ";
		return str;
	}
	
	
}
