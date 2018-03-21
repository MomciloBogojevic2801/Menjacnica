package menjacnica.interfejs;

//import menjacnica.KursnaLista;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(String kod, String naziv, double prodajniKurs, double kupovniKurs, double srednjiKurs); // bez datuma, uzima
																									// se datum trenutka
																									// unosenja zbog
																									// jednostavnosti

	public void obrisiKurs(String kod); // brise sve kurseve za danasnji datum, onemogucava se pristup kursevima od
										// prethodnih dana

	public Valuta vratiKurs(String kod); // vraca kursnu listu za odredjenu valutu, datum trenutka poziva

}
