package ucionica;

public class GlavniP {

	public static void main(String[] args) {

		Polaznik p1= new Polaznik ("Milos", "Milosevic",01);
		Polaznik p2= new Polaznik ("Marko", "Markovic",02);
		System.out.println(p1.getIme()+"_"+p1.getPrezime()+"{"+p1.getIdBroj()+"}");
		System.out.println(p2.getIme()+"_"+p2.getPrezime()+"{"+p2.getIdBroj()+"}");
		
		Laptop l= new Laptop(polaznik, "Acer");
		System.out.println(l.getMarka()+"{"+polaznik+"}");
		
	}

}
