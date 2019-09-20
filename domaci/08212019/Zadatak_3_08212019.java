package domaci;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5050
		// Ispis: Niz je rastuci.
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n=sc.nextInt();
		int[] niz=new int[n];
		int i;
		for (i = 0; i < niz.length; i++) {
			System.out.println("Unesi element " + i);
			niz[i] = sc.nextInt(); }
			for(i=0; i<niz.length-1; i++) {
		
				if (niz[i]>=niz[i+1]) {
				System.out.println("Niz nije rastuci!");
				} else {
						System.out.println("Niz je rastuci");
						break;
		
	}
		}
	}
			}
		
	


	