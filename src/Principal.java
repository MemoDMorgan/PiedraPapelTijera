
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador");
        String nombre = lector.next();
        System.out.println("Bienvenido al juego Piedra-Papel-Tijera");
        System.out.print("Cuantas Rondas va a jugar?");
        int rondas = lector.nextInt();
        int puntosMaquina = 0;
        int puntosJugador = 0;

        for (int i = 0; i < rondas; i++) {
            System.out.println("Ingrese su jugada, 1 Piedra, 2 Papel 3 Tijera");
            int jugadaJugador = lector.nextInt();
            int jugadaMaquina = (int) (Math.random() * 3) + 1;
            System.out.println("La maquina jugo:" + jugadaMaquina);

            if ((jugadaJugador == 1 && jugadaMaquina == 1) || (jugadaJugador == 2 && jugadaMaquina == 2) || (jugadaJugador == 3 && jugadaMaquina == 3)) {
                puntosJugador++;
                puntosMaquina++;
                System.out.println("Empate");
            } else if (jugadaJugador == 1 && jugadaMaquina == 3 || (jugadaJugador == 2 && jugadaMaquina == 1) || (jugadaJugador == 3 && jugadaMaquina == 2)) {
                puntosJugador++;
                System.out.println("Punto para el jugador");
            } else {
                puntosMaquina++;
                System.out.println("Punto para la máquina");
            }
        }
        System.out.println("**********Resultados*************");
        System.out.println("Puntos Máquina:" + puntosMaquina);
        System.out.println("Puntos Jugador:" + puntosJugador);
        if (puntosJugador == puntosMaquina) {
            System.out.println("Empate");
        } else if (puntosJugador > puntosMaquina) {
            System.out.println("Ganó el Jugador:" + nombre);
        } else {
            System.out.println("Ganó la máquina !");
        }
    }
}
