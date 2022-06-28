package jana60;

/*
 * Consegna: Creare un�interfaccia Poligono con due metodi: calcolaPerimetro() e calcolaArea().
 * Creare almeno due classi concrete che rappresentano dei poligoni e che implementano l�interfaccia.
 * Ogni classe pu� avere un insieme di propri attributi, costruttori e anche altri metodi oltre a quelli dell�interfaccia.
 * Creare una classe Main di test in cui generare delle istanze dei poligoni e testare i metodi di calcolo del perimetro e dell�area.
 */

public interface Poligono {

	public void calcolaPerimetro(int lato, int angoli);

	public void calcolaArea(int perimetro, int apotema);
}
