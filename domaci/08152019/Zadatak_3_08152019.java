package domaci;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite a:");
		int a = sc.nextInt();
		System.out.println("Unesite b:");
		int b = sc.nextInt();

		for (int m = 0; m < a; m++) {

			for (int n = 0; n < b; n++) {

				System.out.print("*     ");
			}
			System.out.println();
			System.out.println();

		}
	}

}
