package domaci;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// FOR - Napisati program za ispis parnih prirodnih brojeva od 1 do n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite n:");
		int n=sc.nextInt();
		int i;
		for(i=1; i<=n; i++)  {
			if(i%2==0)  {
				System.out.println(i);
			}
		}

	}

}
