package n2exercici1;

import java.util.Scanner;

public class Aplicacio {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		Smartphone mobil = new Smartphone("Poco", "X3");
		
		System.out.println("Quin és el teu número de teléfon?");
		String tlfn = teclat.nextLine();
	
		mobil.trucar(tlfn);
		
		mobil.fotografiar();
		mobil.alarma();

	}

}
