package pp1;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji racuna sumu parnih brojeva i proizvod neparnih
		 * brojeva od 0 do n. Koristiti jednu petlju
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti ceo broj n: ");
		int n = sc.nextInt();
		int br = 0;
		int sum = 0;
		int proizvod = 1;
		while (br <= n) {
			if (br % 2 == 0) {
				sum += br;
				br += 1; 
				System.out.println("Suma parnih brojeva je: " + sum);
			} else {
				proizvod *= br;
				br += 1;
				

			}
			System.out.println("Proizvod neparnih brojeva je" + proizvod);
		}

	}

}
