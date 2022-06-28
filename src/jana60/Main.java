package jana60;

public class Main {

	public static void main(String[] args) {

		Poligono figura1 = new TriangoloEquilatero();
		figura1.calcolaPerimetro(10, 3);

		Poligono figura2 = new Quadrato();
		figura2.calcolaArea(40, 5);
	}

}
