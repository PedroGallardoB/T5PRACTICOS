package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 // Variable que representa el tablero visible para el usuario.
		String show[] = { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" };
       
		 // Variable que representa las minas.
        String minas[] = { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" };
       
        int posicion; //Variable que almacena la posición que el usuario quiere descubrir.
        
        int contador = 0;  //Variable que lleva la cuenta de las posiciones descubiertas por el usuario.
       
        boolean fin = false; //Variable que indica si el juego ha finalizado.
        
        Scanner sc = new Scanner(System.in);

        Juego.ponerBombas(minas); // Método para colocar las minas en el tablero.
   
        Juego.excepcion(minas); //Método para poner números en las esquinas.
        
        Juego.crearTablero(minas);  //Método para crear el tablero visible.
       
		System.out.println("BIENVENIDO AL BUSCAMINAS:"); //Presentacion juego
		System.out.println();
		System.out.println("LOS ASTERISCOS SON BOMBAS."); //Explicacion 
		while (fin == false) { //Si el juego no ha terminado
			System.out.println("INTRODUZCA UNA POSICIÓN DEL 1 AL 20 PARA DESCUBRIRLA.");//Pide posicion
			System.out.println(Arrays.toString(show));//Enseña tablero
			posicion = sc.nextInt() - 1;//Establece el valor de la posicion
			
			if(show[posicion].equals("X")) {//Si no estaba destapado
				contador++;//Se suma el contador
			}
			
				show[posicion] = minas[posicion]; //Da el valor del tablero oculto al que muestra
				
				if (minas[posicion].equals("*")) {//Si te toca bomba
					System.out.println("HAS PERDIDO, !EXPLOTÓ!");//Mensaje de perder
					System.out.println(Arrays.toString(minas));//Enseñas tablero
					fin = true;//Condicion de fin se cumple
					break;
				}
				if (contador == 14) {//Si llegastes a destapar todo
					System.out.println("¡GANASTES!");//Ganas
					fin = true;//Condicion de fin se cumple
				}
			}
			
			
		
		sc.close();
	}
}
