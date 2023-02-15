package lassieteymedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Variable auxiliar de turnos
		int contador = 0;
		// Variables que almacenan puntuaciones
		double jug1 = 0;
		double jug2 = 0;
		String eleccion;
		//Array que almacena los valores de las cartas
		double valores[][] = { { 1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5 }, { 1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5 },
				{ 1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5 }, { 1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5 } };

		Scanner sc = new Scanner(System.in);

		System.out.println("BIENVENIDO A LAS SIETE Y MEDIA.");

		System.out.println("TURNO DEL JUGADOR 1");//Turno jugador 1

		while (contador != 1) {//Condicion de turno
			System.out.println("¿Quieres coger una carta?(s/n)");//Pide eleccion
			eleccion = sc.next();//Lee eleccion
			switch (eleccion) {
			case "s":
				jug1 += Juego.robarCartas(valores);//Roba carta
				break;
			case "n":
				contador++;//Pasa turno
				break;
			}
			if (jug1 > 7.5) {//Si se pasa
				contador++;//Sale de bucle
			}
		}
		contador = 0;
		System.out.println("TURNO DEL JUGADOR 2");
		while (contador != 1) {//Condicion de turno
			System.out.println("¿Quieres coger una carta?(s/n)");//Pide eleccion
			eleccion = sc.next();//Lee eleccion
			switch (eleccion) {
			case "s":
				jug2 += Juego.robarCartas(valores);//Roba carta
				break;
			case "n":
				contador++;//Pasa turno
				break;
			}
			if (jug2 > 7.5) {//Si se pasa
				contador++;//Sale de bucle
			}
		}

		Juego.ganar(jug1, jug2);//Condiciones ganador

		sc.close();
	}

}
