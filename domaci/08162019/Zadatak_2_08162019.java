package domaci;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		// WHILE - Izracunati sumu prirodnih brojeva u intervalu od 1 do n koji su deljivi sa 7 i sa 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while (i<=n)  {
			
			
			if (i%3==9 && i%7==0) 
					sum+=i;
					i++;
		}
		System.out.println(sum);

	}



			}

			
		



