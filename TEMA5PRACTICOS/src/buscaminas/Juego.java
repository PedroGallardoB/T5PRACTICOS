package buscaminas;

public class Juego {

	static void excepcion(String t[]) {//PONE PISTAS EN ESQUINAS

		//VALORES PARA ESQUINA IZQ
		int lado = 1;// Posicion lado
		int esquina = 0;// Posicion esquina
		int contador = 0;//Auxiliar para salir de bucle 

		while (contador < 2) {
			if (t[lado].equals("*") && t[esquina].equals("X")) {//Si al lado hay bomba 
				t[esquina] = "1";//Lo indica
			} else if (!t[esquina].equals("*")) {//Si al lado no hay bomba
				t[esquina] = "0";//Lo indica
			}
			//VALORES PARA CAMBIAR DE ESQUINA
			esquina = t.length - 1;
			lado = t.length - 2;
			contador++;//Aumenta el contador
		}
	}

	static void crearTablero(String t[]) {//PONE PISTAS

		for (int i = 1; i < t.length - 1; i++) {//Comprueba la posicionn de adelante y atras para saber si hay dos bombas
			if (t[i].equals("0") && t[i - 1].equals("*") && t[i + 1].equals("*")) {
				t[i] = "2";//Lo indica
			} else if (t[i].equals("0") && t[i - 1].equals("*")||t[i].equals("0") && t[i + 1].equals("*")) { //Comprueba la posicionn de adelante y atras para saber si hay una bombas

				t[i] = "1";//Lo indica
			}
		}
	}

	static void ponerBombas(String t[]) {//PONE BOMBAS

		int posicion; //Posicion de bombas
		int contador = 0; //Contador de bombas

		while (contador < 6) {//Mientras no haya seis bombas
			posicion = (int) (Math.random() * 20);//Genera posicion aleatoria
			if (t[posicion].equals("0")) {//Si esta libre
				t[posicion] = "*";//Pone bomba
				contador++;//Suma bomba
			}
		}
	}

}
