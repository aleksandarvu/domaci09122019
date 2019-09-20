package pp2;

public class Zadatak_dodatni_a_08132019 {

	public static void main(String[] args) {
		// a)Napisati program koji ce MNOZITI brojeve od 1 do 5. Program treba da ispise
		// PROIZVOD.

		int br = 1;
		int proizvod = 1;
		while (br <= 5) {
			proizvod *= br;
			br += 1;

		}
		System.out.println(proizvod);
	}

}
