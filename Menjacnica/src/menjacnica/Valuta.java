package menjacnica;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String kod; // ovo predstavlja skracenicu dolar - > USD
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null)
			throw new MenjacnicaException("Uneti naziv je null!");
		this.naziv = naziv;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		if (kod == null)
			throw new MenjacnicaException("Uneti kod valute je null!");
		this.kod = kod;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new MenjacnicaException("Uneta vrednost je null!"); // razmisli o tome da li moze da se stavi
																		// drugacija provera?
		this.datum = datum;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0)
			throw new MenjacnicaException("Uneta vrednost nije dozvoljena!");
		this.prodajniKurs = prodajniKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0)
			throw new MenjacnicaException("Uneta vrednost nije dozvoljena!");
		this.kupovniKurs = kupovniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0)
			throw new MenjacnicaException("Uneta vrednost nije dozvoljena!");
		this.srednjiKurs = srednjiKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kod == null) ? 0 : kod.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kod == null) {
			if (other.kod != null)
				return false;
		} else if (!kod.equals(other.kod))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	/*
	 * @Override public String toString() { return "Valuta [naziv=" + naziv +
	 * ", kod=" + kod + ", datum=" + datum + ", prodajniKurs=" + prodajniKurs +
	 * ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs + "]"; }
	 */
	@Override
	public String toString() {
		return "Valuta: Naziv: " + naziv + ", Kod: " + kod + ", Datum: " + datum.getTime() + ", Prodajni kurs: "
				+ prodajniKurs + ", Kupovni kurs: " + kupovniKurs + ", Srednji kurs: " + srednjiKurs;
	}

}
