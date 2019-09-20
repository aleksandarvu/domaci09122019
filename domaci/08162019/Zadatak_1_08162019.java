package domaci;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Napisati program za odredjivanje z po formuli
		// x>=0, onda je z=x+3
		// x<0, onda je z=x-1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite x: ");
		int x=sc.nextInt();
		int z=0;
		if (x>=0)  {
			z=x+3;
		}else {
				z=x-1;
			}
		System.out.println(z);
		}
	
		
					}
				
			
			
		
		
	


