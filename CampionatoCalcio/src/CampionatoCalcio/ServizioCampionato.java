package CampionatoCalcio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class ServizioCampionato {
	
	// REGISTRA GIOCATORE
	public Giocatore registraGiocatore(Campionato c, String nome, String cognome, String codiceFiscale){
		Giocatore gTemp = null;
		if(c.getMappaGiocatori().containsKey(codiceFiscale)){
			return gTemp;
		}
		else{
			gTemp = new Giocatore(nome,cognome,codiceFiscale);
			c.getMappaGiocatori().put(codiceFiscale, gTemp);
			return gTemp;
		}	
	}
	
	// REGISTRA SQUADRA
	public Squadra registraSquadra(Campionato c, String nome, String codiceSquadra){
		Squadra sTemp = null;
		if(c.getMappaSquadre().containsKey(codiceSquadra)){
			return sTemp;
		}
		else{
			sTemp = new Squadra(nome, codiceSquadra);
			c.getMappaSquadre().put(codiceSquadra, sTemp);
			return sTemp;
		}
	}
	
	// ASSEGNO UN GIOCATORE PASSATO PER PARAMETRO ALLA SQUADRA PASSATA PER PARAMETRO
	public boolean assegnaGiocatoreSquadra(Campionato c, Giocatore g, Squadra s){
		boolean assegnato = false;
		if((c.getMappaGiocatori().containsKey(g.getCodiceFiscale())) && (c.getMappaSquadre().containsKey(s.getCodiceSquadra()))){
			s.getGiocatoriDellaSquadra().add(g);
			assegnato = true;
		}
		return assegnato;	
	}
	
	// REGISTRA PARTITA
	public Partita registraPartita(Campionato c, Squadra sCasa, Squadra sOspite, int retiCasa, int retiOspite, 
			Date dataPartita, List<Giocatore> retiFatte, List<Giocatore> espulsi, List<Giocatore> ammoniti){
		
		setRetiGiocatore(c,retiFatte);
		setEspulsiGiocatore(c,espulsi);
		setAmmonitiGiocatore(c,ammoniti);
		
		Partita p;
		char risultato;
		
		if(retiCasa == retiOspite){
			risultato = 'X';
		}
		else if(retiCasa > retiOspite){
			risultato = '1';
		}
		else{
			risultato = '2';
		}
		
		p = new Partita(dataPartita,sCasa.getNome(),sOspite.getNome(),retiCasa,retiOspite,risultato);
		c.getMappaPartite().put(dataPartita, p);
		
		return p;	
	}
	
	// METODO PRIVATE SETTA RETI DEL GIOCATORE
	private void setRetiGiocatore(Campionato c, List<Giocatore> retiFatte){
		if(retiFatte != null){
			for(Giocatore g : retiFatte){
				c.getMappaGiocatori().get(g.getCodiceFiscale()).setReti(
				c.getMappaGiocatori().get(g.getCodiceFiscale()).getReti()+1
				);
				g.setReti(g.getReti()+1);
			}
		}
	}
	
	// METODO PRIVATE SETTA ESPULSIONI DEL GIOCATORE
	private void setEspulsiGiocatore(Campionato c, List<Giocatore> espulsi){
		if(espulsi != null){
			for(Giocatore g : espulsi){
				c.getMappaGiocatori().get(g.getCodiceFiscale()).setEspulsioni(
				c.getMappaGiocatori().get(g.getCodiceFiscale()).getEspulsioni()+1
				);
				g.setEspulsioni(g.getEspulsioni()+1);
			}
		}
	}
	
	// METODO PRIVATE SETTA AMMONIZIONI DEL GIOCATORE
	private void setAmmonitiGiocatore(Campionato c, List<Giocatore> ammoniti){
		if(ammoniti != null){
			for(Giocatore g : ammoniti){
				c.getMappaGiocatori().get(g.getCodiceFiscale()).setAmmonizioni(
				c.getMappaGiocatori().get(g.getCodiceFiscale()).getAmmonizioni()+1
				);
				g.setAmmonizioni(g.getAmmonizioni()+1);
			}
		}
	}
	
	// RESTITUISCE IL CAPOCANNONIERE DEL CAMPIONATO
	public Giocatore getCapoCannoniere(Campionato c){
		List<Giocatore> listaGiocatori = new ArrayList<>(c.getMappaGiocatori().values());
		Collections.sort(listaGiocatori, new ComparatorGiocatore());
		return listaGiocatori.get(0);
	}
	
	// RESTITUISCE LA SQUADRA CAMPIONE DEL CAMPIONATO
	public Squadra getCampione(Campionato c){
		List<Squadra> campione=new ArrayList<Squadra>(c.getMappaSquadre().values());
		Collections.sort(campione, new SquadraComparator(c));
		return campione.get(0);
	}

}
