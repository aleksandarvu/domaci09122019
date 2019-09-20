package domaci;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
	/*	Napisati program koji ucitava ceo broj n.
	 * Taj broj n se prosledjuje metodi koja formira i vraca ceo broj
	 * koji predstavlja inverzan broj. Glavni program nakon toga ispisuje taj inverzan broj
	 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite ceo broj");
		int unos = sc.nextInt();
		System.out.println(invBr(unos));
	}

	public static int invBr(int n) {

		int br = 0;
		while (n != 0) {
			int c = n % 10;
			br *= 10;
			br += c;
			n /= 10;
		}
		return br;
	}

}
