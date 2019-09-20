package pp2;

import java.util.Scanner;

public class Zadatak_dodatni_b_08132019 {

	public static void main(String[] args) {
		/*
		 * b) Napisati program koji ce POMNOZITI sve brojeve od 1 do n (n uneti preko konzole).
		 *  Program treba da ispise PROIZVOD.
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n=sc.nextInt();
		int proizvod=1;
		int br=1;
		while (br<=n) {
			proizvod*=br;
			br+=1;
		
		}
		System.out.println("Proizvod brojeva od 1 do n je: "+ proizvod);
	}

}
