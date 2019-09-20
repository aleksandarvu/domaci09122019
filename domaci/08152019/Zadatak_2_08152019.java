package domaci;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		int x = 0, y = 1;
		int z;
		int i;
		System.out.println("Unesite broj do koga zelite da ide Fibonacijev niz: ");
		int a = sc.nextInt();
		System.out.print(x + " " + y);
		for (i = 2; (x + y) <= a; i++) {
			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
		*/	
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 1;
		int z;
		int i;
		System.out.println("Unesite koliko clanova Fibonacijevog niza zelite: ");
		int a = sc.nextInt();
		System.out.print(x + " " + y);
		for (i = 3; i <= a; i++) {
			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
		
		
		}
		
		
		
		
		
	}
}
