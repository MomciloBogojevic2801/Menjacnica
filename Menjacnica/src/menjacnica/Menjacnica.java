package menjacnica;

import java.util.*;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	public LinkedList<Valuta> kursnaLista = new LinkedList<>();

	@Override
	public void dodajKurs(String kod, String naziv, double prodajniKurs, double kupovniKurs, double srednjiKurs) {
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setKod(kod);
		v.setProdajniKurs(prodajniKurs);
		v.setKupovniKurs(kupovniKurs);
		v.setSrednjiKurs(srednjiKurs);
		GregorianCalendar g = new GregorianCalendar();
		v.setDatum(g);

		kursnaLista.add(v);
		System.out.println("Uneto je: " + v.toString());

	}

	@Override
	public void obrisiKurs(String kod) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if (kursnaLista.get(i).getKod() == kod)
				kursnaLista.remove(i);
		}

	}

	@Override
	public Valuta vratiKurs(String kod) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if (kursnaLista.get(i).getKod() == kod) {
				System.out.println("Trazeno je: " + kursnaLista.get(i).toString());
				return kursnaLista.get(i);

			}
		}
		throw new MenjacnicaException("Nema kursa za taj kod!");

	}

}
