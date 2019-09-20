package domaci;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava tri cela broja
		// i metodu koja ispisuje brojeve od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		Scanner sc=new Scanner(System.in);
		int niz[] = new int[3];
		niz(niz);
		// deljiviNiz(niz);
	}

	public static void niz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesi element " + i + " datog niza");
			niz[i] = sc.nextInt();
		}
		System.out.println("Brojevi koji su deljivi sa trecim su: ");
		while (niz[0] <niz[1]) {
			niz[0]++;
			if ((niz[0]) % (niz[2]) == 0)
				System.out.print(niz[0]+" ");
		}
	}

}
