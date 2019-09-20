package domaci_09122019;

public class Kalkulator {

private double value;
	
	public Kalkulator add(double a) {
		value = value + a;
		return this;
	}	public Kalkulator sub(double a) {
			value = value - a;
			return this;	
		
	}	public Kalkulator div(double a) {
		value = value / a;
		return this;
	
		
	}	public Kalkulator mul(double a) {
		value = value * a;
		return this;
		
	}	public double getValue() {
		return value;
	}
}
