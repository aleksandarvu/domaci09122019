package domaci;

import java.util.Scanner;

public class Zadatak_2_korigovan_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite jedan od ponudjenih: kvadrat, krug ili pravougaonik - ispisite tacan naziv");
		String x;
		double a, b, r, p;
		x = sc.nextLine();
		switch (x) {
		case "kvadrat":
			System.out.println("Unesite stranicu kvadrata: ");
			a = sc.nextDouble();
			if (a > 0) {
				System.out.println("Povrsina kvadrata je: " + (a * a));
			} else if (a <= 0) {
				System.out.println("Velicina stranice mora biti >0");
			} break;

		case "krug":
			System.out.println("Unesite poluprecnik kruga: ");
			r = sc.nextDouble();
			if (r > 0) {

				System.out.println("Povrsina kruga je: " + (r * r * 3.14));
			} else if (r <= 0) {
				System.out.println("Velicina mora biti >0");
			} break;
		case "pravougaonik":
			System.out.println("Unesite prvu stranicu pravougaonika: ");
			a=sc.nextDouble();
			
				System.out.println("Unesite drugu stranicu pravougaonika: ");
				b=sc.nextDouble();
				if (a>0 && b>0) {
					System.out.println("Povrsina pravougaonika je: "+a*b); }
				else if (a<=0 || b<=0) {
					System.out.println("Velicina stranice mora biti >0");
				} break;
				default: System.out.println("Los unos!"); break;
				
			}
		System.out.println("Kraj programa!");

		}
	}


