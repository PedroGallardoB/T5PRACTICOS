package lassieteymedia;

public class Juego {
	


	public static double robarCartas(double[][] valores) {
		int numero;//numero de la carta
		int palo;//palo de la carta
		String paloStr = "A";//Palo escrito
		String carta = "A";//Cartas especiales
		double puntuacion=0;

		palo = (int) (Math.random() * 4);//Genera el palo
		numero = (int) (Math.random() * 10);//Genera el numero
		
		
			switch (palo) {//Asigna un nombre a los palos
			case 0:
				paloStr = " de copas";
				break;
			case 1:
				paloStr = " de oros";
				break;
			case 2:
				paloStr = " de bastos";
				break;
			case 3:
				paloStr = " de espadas";
				break;
			}

			if (numero > 6) {//Asigna un nombre a las cartas especiales
				switch (numero) {
				case 7:
					carta = "Sota";
					break;
				case 8:
					carta = "Caballo";
					break;
				case 9:
					carta = "Rey";
					break;
				}
			}

				if (numero <= 8) {//Si la carta no vale medio punto
					System.out.println((numero+1) + paloStr + " VALOR: " + valores[palo][numero]);//Imprime carta
				} else {//De lo contrario
					System.out.println(carta + paloStr + " VALOR: " + valores[palo][numero]);//Imprime carta
					System.out.println();
				}
				puntuacion+=valores[palo][numero]; //Suma la puntuacion al jugador
			
		
		return puntuacion; //Devuelve la puntuacion
		
		
	}
	
	public static void ganar(double jug1, double jug2) {
		if (jug1 == jug2 || (jug1 > 7.5 && jug2 > 7.5)) { //Condiciones de empate
			System.out.println("Los jugadores han empatado");
		}
		if (jug1 > jug2 && jug1 < 7.5||(jug2>7.5&&jug1<7.5)) { //Condiciones de empate ganar J1
			System.out.println("GANA EL JUGADOR 1");
		}
		if (jug2 > jug1 && jug2 < 7.5||(jug1>7.5&&jug2<7.5)) { //Condiciones de empate ganar J2
			System.out.println("GANA EL JUGADOR 2");
		}
	}
}