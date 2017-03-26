package specifikacija;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKurs(String naziv, Kurs k);
	public void obrisiKurs(String naziv, Kurs k);
	public Kurs vratiKurs(String naziv, GregorianCalendar datum);
}

