package domaci_08302019;

public class GlavniP {
		public static void main(String[] args) {
			Njiva n = new Njiva(100, 95);
			Njiva n1 = new Njiva(120, 100);
			Njiva n2 = new Njiva(220, 180);
			Suma s = new Suma(600, 500, 300, 2);
			Suma s1 = new Suma(300, 150, 50, 2);
			Parcela [] niz2 = new Parcela [3];
			Parcela[]niz= {n, n1, n2, s, s1};
			for (int i=0; i<niz.length; i++) {
				System.out.println(niz[i]);
	}

}
}