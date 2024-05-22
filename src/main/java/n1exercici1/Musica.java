package n1exercici1;

public class Musica {

	public static void main(String[] args) {
		
		Vent flauta = new Vent("flauta", 450);
		Percussio marimba = new Percussio("marimba", 2000);
		
		flauta.tocar();
		marimba.tocar();

	}

}

