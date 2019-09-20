package domaci_08272019_knjige;

public class GlavniKnjige {

	public static void main(String[] args) {

		Knjiga k1=new Knjiga ("Knjiga 1", "Autor 1", 101, 2010);
		Knjiga k2=new Knjiga ("Knjiga 2", "Autor 2", 201, 2011);
		Knjiga k3=new Knjiga ("Knjiga 3", "Autor 3", 301, 2012);
		System.out.println(k1.getNaziv()+" "+k1.getAutor()+" "+k1.getBrStrana()+" "+k1.getGodIzdanja());
		System.out.println(k2.getNaziv()+" "+k2.getAutor()+" "+k2.getBrStrana()+" "+k2.getGodIzdanja());
		System.out.println(k3.getNaziv()+" "+k3.getAutor()+" "+k3.getBrStrana()+" "+k3.getGodIzdanja());
	}

}
