package pp2;

import java.util.Scanner;

public class Zadatak_2b_08132019 {

	public static void main(String[] args) {
		/*
		 * b) Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko konzole).
		 *  Program treba da ispise zbir.
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n=sc.nextInt();
		int sum=0;
		int br=1;
		while (br<=n) {
			sum+=br;
			br+=1;
		
		}
		System.out.println(sum);
	}

}
