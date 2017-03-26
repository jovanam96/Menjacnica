package specifikacija;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Kurs;
import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs{
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String naziv, Kurs k) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)) {
				valute.get(i).getKursevi().add(k);
			}
		}
	}

	@Override
	public void obrisiKurs(String naziv, Kurs k) { 
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)) {
				valute.get(i).getKursevi().remove(k);
			}
		}
	}

	@Override
	public Kurs vratiKurs(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)){
				LinkedList<Kurs> kursevi = valute.get(i).getKursevi();
				for (int j = 0; j < kursevi.size(); j++) {
					if(kursevi.get(j).getDatum().equals(datum)) {
						return kursevi.get(j);
					}
				}
			}
		}
		return null;
	}
}
