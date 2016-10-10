package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import CampionatoCalcio.Campionato;
import CampionatoCalcio.Giocatore;
import CampionatoCalcio.Partita;
import CampionatoCalcio.ServizioCampionato;
import CampionatoCalcio.Squadra;

public class testCampionatoCalcio {

	public static void main(String[] args) {
		
		// CREO UN CAMPIONATO E CREO UN SERVIZIO CAMPIONATO
		Campionato c = new Campionato("Campionato di Calcio");
		ServizioCampionato sc = new ServizioCampionato();
		
		// CREO GIOCATORI
		Giocatore g1 = new Giocatore("Arturo", "Vidal", "000000001");
		Giocatore g2 = new Giocatore("Gianluigi", "Buffon", "000000002");
		Giocatore g3 = new Giocatore("Paolo", "Dybala", "000000003");
		Giocatore g4 = new Giocatore("Giorgio", "Chiellini", "000000004");
		Giocatore g5 = new Giocatore("Mio", "Patatino", "000000005");
		Giocatore g6 = new Giocatore("Tua", "Patatina", "000000006");
		
		// CREO SQUADRE
		Squadra s1 = new Squadra("Juventus", "01");
		Squadra s2 = new Squadra("Torino", "02");
		
		// REGISTRA GIOCATORE     OK!!!
		sc.registraGiocatore(c,g1.getNome(), g1.getCognome(), g1.getCodiceFiscale());
		sc.registraGiocatore(c,g2.getNome(), g2.getCognome(), g2.getCodiceFiscale());
		sc.registraGiocatore(c,g3.getNome(), g3.getCognome(), g3.getCodiceFiscale());
		sc.registraGiocatore(c,g4.getNome(), g4.getCognome(), g4.getCodiceFiscale());
		sc.registraGiocatore(c,g5.getNome(), g5.getCognome(), g5.getCodiceFiscale());
		sc.registraGiocatore(c,g6.getNome(), g6.getCognome(), g6.getCodiceFiscale());
		
		// STAMPA MAPPA GIOCATORI
		for(Map.Entry<String,Giocatore> m : c.getMappaGiocatori().entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// REGISTRA SQUADRA    OK!!!
		sc.registraSquadra(c, "Juventus", "01");
		sc.registraSquadra(c, "Torino", "02");
		
		System.out.println();
		
		// STAMPA MAPPA SQUADRE
		for(Map.Entry<String,Squadra> m : c.getMappaSquadre().entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// ASSEGNO GIOCATORE A SQUADRA   OK!!!
		sc.assegnaGiocatoreSquadra(c, g1, s1);
		sc.assegnaGiocatoreSquadra(c, g2, s2);
		sc.assegnaGiocatoreSquadra(c, g3, s2);
		sc.assegnaGiocatoreSquadra(c, g4, s2);
		sc.assegnaGiocatoreSquadra(c, g5, s1);
		sc.assegnaGiocatoreSquadra(c, g6, s1);
		
		System.out.println();
		
		// STAMPO LISTA GIOCATORI DELLA SQUADRA
		System.out.println(s1.toStringGiocatoriDellaSquadra());
		System.out.println(s2.toStringGiocatoriDellaSquadra());
		
		// PARTITA
		Date data = new Date();
		List<Giocatore> bomber = new ArrayList<Giocatore>();
		List<Giocatore> espulsi = new ArrayList<Giocatore>();
		List<Giocatore> ammoniti = new ArrayList<Giocatore>();
		
		bomber.add(g1);
		bomber.add(g1);
		bomber.add(g2);
		bomber.add(g3);
		
		espulsi.add(g4);
		ammoniti.add(g5);
		ammoniti.add(g6);
		
		// REGISTRA PARTITA
		sc.registraPartita(c, s1, s2, 2,1, data, bomber, espulsi, ammoniti);
		
		System.out.println();
		
		// STAMPA MAPPA PARTITA
		for(Map.Entry<Date,Partita> m : c.getMappaPartite().entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println();
		
		// STAMPA LISTA BOMBER
		for(Giocatore g : bomber){
			System.out.println(g.getNome());
		}
		
		System.out.println();
		
		// STAMPA LISTA ESPULSI
		for(Giocatore g : espulsi){
			System.out.println(g.getNome());
		}
		
		System.out.println();
				
		// STAMPA LISTA AMMONITI
		for(Giocatore g : ammoniti){
			System.out.println(g.getNome());
		}
		
		System.out.println();
		
		// STAMPA CAPOCANNONIERE
		System.out.println(sc.getCapoCannoniere(c));
		
		System.out.println();
		
		// STAMPA CAMPIONE
		System.out.println(sc.getCampione(c));
		
	}

}
