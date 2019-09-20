package pp2;

import java.util.Scanner;

public class Zadatak_dodatni_c_08132019 {

	public static void main(String[] args) {
		/*
		 * c) Napisati program koji ce POMNOZITI sve brojeve od k do n (k i n uneti preko
		 * konzole). Program treba da ispise PROIZVOD.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi k: ");
		int k = sc.nextInt();
		System.out.println("Unesi n");
		int n = sc.nextInt();
		int proizvod = 1;

		while (k <= n) {
			proizvod *= k;
			k += 1;
		}
		System.out.println("Proizvod svih brojeva izmedju k i n ukljucujuci i k i n je: " + proizvod);
	}
}
