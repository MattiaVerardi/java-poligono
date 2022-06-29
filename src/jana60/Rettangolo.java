package jana60;

public class Rettangolo implements Poligono {

	private double base;
	private double altezza;

	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaPerimetro() {
		return base * 2 + altezza * 2;
	}

	@Override
	public double calcolaArea() {
		return base * altezza;
	}

}
