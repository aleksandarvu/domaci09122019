package domaci;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		//Korisnik ucitava niz od n elemenata niza, kao i neko broj br.
		//Program ispisuje elemente niza deljive brojem br.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n=sc.nextInt();
		int[] niz=new int[n];
		System.out.println("Unesi br:");
		int br=sc.nextInt();
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element " + i);
			niz[i] = sc.nextInt();
	}
		for (int i=0; i<niz.length; i++) {
			if (niz[i]%br==0) {
			System.out.print(" " +niz [i]);
			}
		}
			
		}
}
