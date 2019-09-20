package pp2;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

	public static void main(String[] args) {
		/* 
		 * c) Napisati program koji ce sabrati sve brojeve od k do n (k i n uneti preko konzole).
		 *  Program treba da ispise zbir.
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi k: ");
		int k=sc.nextInt();
		System.out.println("Unesi n");
		int n=sc.nextInt();
		int sum=0;
		
		while (k<=n) {
			sum+=k;
			k+=1;
		}
		System.out.println("Zbir brojeva izmedju k i n ukljucujuci i k i n je: " + sum);
		
	}
	

}
