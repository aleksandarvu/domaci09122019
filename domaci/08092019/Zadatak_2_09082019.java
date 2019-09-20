package domaci;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite jedan od ponudjenih: kvadrat, krug ili pravougaonik");
		String x;
		x=sc.nextLine(); {
		if (x = "kvadrat"); {
			System.out.println("Unesi velicinu stranice: ");
			double a;
			System.out.println("Povrsina kvadrata je: "+(a*a));}
		else { if (x="krug");
		{System.out.println("Unesi velicinu poluprecnika kruga: ");
		double r;
		System.out.println("Povrsina kruga je: " + (r*r*3.14));}
		else { if (x="pravougaonik");
		System.out.println("Unesi stranicu a pravougaonika");
		double b;
		System.out.println("Unesi stranicu b pravougaonika");
		double c;
		System.out.println("Povrsina pravougaonika je: "+ (b*c));
		}
		else
			System.out.println("Pogresan unos");
		}
		}
		}
		
	}

}
