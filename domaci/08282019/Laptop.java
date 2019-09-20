package ucionica;

public class Laptop {

	// Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. Marka moze samo da se dohvati.
	// Laptop takdje moze da menja polaznika ili da ostane bez polaznika.
	// Moze da se ispise u obliku: MARKA{POLAZNIK}
	private Polaznik polaznik;
	private String marka;
	public Laptop(Polaznik polaznik, String marka) {
		this.polaznik = polaznik;
		this.marka = marka;
	}
	public String getMarka() {
		return marka;
	}
	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void setPolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}
	public void ukloniPolaznik() {
		polaznik=null;
	}
	public String ispisiPolaznik() {
		String s;
		if (polaznik==null) {
			s="NEMA KORISNIKA";
		} else {
			s=polaznik.ispisiPolaznik;
			}
		return "{"+s.polaznik+"}";
		
		
	}
}
