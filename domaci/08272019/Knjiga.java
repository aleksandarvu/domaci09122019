package domaci_08272019_knjige;

public class Knjiga {

	// Napisati klasu Knjige koja ima sledeca polja:
	// naziv knjige, autora, broj strana, godinu izdanja.
	// Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
	// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke.
	
	private String naziv, autor;
	private int brStrana, godIzdanja;
	public Knjiga(String naziv, String autor, int brStrana, int godIzdanja) {
		this.naziv = naziv;
		this.autor = autor;
		this.brStrana = brStrana;
		this.godIzdanja = godIzdanja;
	}
	public String getNaziv() {
		return naziv;
	}
	public String getAutor() {
		return autor;
	}
	public int getBrStrana() {
		return brStrana;
	}
	public int getGodIzdanja() {
		return godIzdanja;
	}
	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}
	

}
