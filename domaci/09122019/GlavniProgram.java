package domaci_09122019;

public class GlavniProgram {

	public static void main(String[] args) {

		Kalkulator k = new Kalkulator();
		double rezultat = k.add(10).sub(2).div(3).mul(4.5).add(-5).getValue();
		System.out.println(rezultat);

	}

	
}
