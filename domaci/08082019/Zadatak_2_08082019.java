package domaci;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi stranicu a: ");
		double a = sc.nextDouble();
		System.out.println("Unesi stranicu b:");
		double b = sc.nextDouble();
		{
		
		if (a>0 && b>0) {
			System.out.println("Obim pravougaonika je: " + 2*(a+b));
			System.out.println("Povrsina pravougaonika je: " + a*b);}
			else {
				System.out.println("Los unos!");

			}
		}
			
	}
	

}