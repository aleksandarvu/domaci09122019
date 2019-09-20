package domaci;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih tela
		 *  (kocke, kvadra, valjka, lopte).
		 *  Koristiti do while petlju i switch grananje. Za izlaz koristiti nulu (0).
		 */
		Scanner sc = new Scanner(System.in);
		int izbor;
		double a,b,c,r,h;
		
		do {
		System.out.println("Program za izracunavanje P geometrijskih tela");
		System.out.println("Izaberite rb geometrijskog tela");
		System.out.println("1 - kocka");
		System.out.println("2 - kvadar");
		System.out.println("3 - valjak");
		System.out.println("4 - lopta");
		System.out.println("0 - izlaz iz programa");
		
		izbor=sc.nextInt();
		
		
		switch (izbor)  {
		
		case 1: System.out.println("Unesite a:");
		a=sc.nextDouble();
		System.out.println("Povrsina kocke je: "+ (6*a*a));
		break;
		
		case 2: System.out.println("Unesite a,b i c:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		System.out.println("Povrsina kvadra je: "+ (2*(a*b+b*c+c*a)));
		break;
		
		case 3: System.out.println("Unesite r i h");
		r=sc.nextDouble();
		h=sc.nextDouble();
		System.out.println("Povrsina valjka je :"+ (2*r*r*3.14+2*r*3.14*h));
		break;
		
		case 4: System.out.println("Unesite r");
		r=sc.nextDouble();
		System.out.println("Povrsina lopte je: "+(4*r*r*3.14));
		break;
		
		default: System.out.println("Los unos!");
		
		case 0: System.out.println("Izlaz iz programa!");
			
			
		}
		 
	}
		while (izbor!=0);
	}
}
