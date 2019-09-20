package ucionica;

public class Polaznik {

	// Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	// Polaznik poseduje i identifikacioni broj  koji se moze dohvatiti.
	// Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje u obliku: IME_PREZIME{ID}.
	private String ime, prezime;
	private int idBroj;
	public Polaznik(String ime, String prezime, int idBroj) {
		this.ime = ime;
		this.prezime = prezime;
		this.idBroj = idBroj;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getIdBroj() {
		return idBroj;
	}
	public void setIdBroj(int idBroj) {
		this.idBroj = idBroj;
	}
	
	
}
