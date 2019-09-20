package domaci_08292019;

public class GlavniP {

	public static void main(String[] args) {
		Student s = new Student("Aleksa", "Aleksic", 1900, 1000, 3, 6.01);
		Student s1 = new Student("Nemanja", "Nemanjic", 1965, 2000, 1, 6.02);
		Student s2 = new Student("Milos", "Milosevic", 2000, 3000, 2, 6.03);
		Profesor p = new Profesor("Marko", "Markovic", 1995, "prof dr");
		Profesor p1 = new Profesor("Saban", "Sabanovic", 1996, "prof dr");
		p.dodajPredmet("srpski");
		p.dodajPredmet("matematika");
		p1.dodajPredmet("engleski");
		p1.dodajPredmet("ruski");
		System.out.println(s.ispis());
		System.out.println(s1.ispis());
		System.out.println(s2.ispis());
		System.out.println(p.ispisi());
		System.out.println(p1.ispisi());
	}

}
