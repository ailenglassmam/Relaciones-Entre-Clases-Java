package Services;

import Entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiceBaraja {
    
    Scanner leer = new Scanner(System.in);

    //defino un arrayList de cartas
    private ArrayList<Carta> cartas;

    //creo la baraja de cada palo con todos sus numeros
    public ArrayList<Carta> crearBaraja() {
        //inicializo el arrayList
        cartas = new ArrayList<>();
        //creo un array con los nombres de los palos
        String[] palo = {"basto", "oro", "copa", "espada"};
        //creo un array con los numeros a asignar a cada carta (numeros como STRING)
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

        //hago un foreach doble: a cada carta... le asigno un palo y un numero de los listados creados anteriormente
        for (String paloCarta : palo) {
            for (String numeroCarta : numeros) {
                //creo una instancia de la clase carta y le paso los datos de cada lista
                Carta carta = new Carta(paloCarta, numeroCarta);
                //agrego al arrayList de la baraja, cada carta creada
                cartas.add(carta);
            }
        }
//devuelvo el arrayList
        return cartas;
    }

    // Recibo la lista de cartas
    public void barajar(ArrayList<Carta> baraja) {
        Collections.shuffle(baraja); //se puede emplear el método shuffle para mezclar aleatoriamente los ELEMENTOS de una COLECCION de DATOS -> el ARRAYLIST
        System.out.println(baraja.toString()); //llamo al toString para IMPRIMIR la COMPOSICION de AMBOS VALORES -> numero + palo
    }
    
    // Recibo la lista de cartas actualizada
    public void siguienteCarta(ArrayList<Carta> baraja) {
        
// hago un bucle for para recorrer el listado de cartas = mazo = baraja
        for (int i = 0; i < baraja.size(); i++) {
            System.out.println("Carta actual: ");
            System.out.println(baraja.get(i));
            System.out.println("Siguiente carta: ");
            System.out.println(baraja.get(i+1));
            System.out.println("¿Desea la siguiente carta?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int respuesta = leer.nextInt();
            if(respuesta == 1){
                baraja.get(i).setCartaUsada(true);
            } else {
                break;
            }
            }
//        System.out.println("Ya no hay más cartas disponibles.");
        }
    
    public void cartasDisponibles(ArrayList<Carta> baraja) {
        //defino un contador para saber cuantas cartas del mazo hay disponibles
        int contador = 0;
        for (int i = 0; i < baraja.size(); i++) {
            if(!baraja.get(i).isCartaUsada()){
                contador++;
            }
        }
        System.out.println("Cartas disponibles: " + contador);
    }
    
    public void darCartas(ArrayList<Carta> baraja) {
        System.out.println("¿Cuantas cartas desea?");
        int cantidadCartasPedidas = leer.nextInt();
        System.out.println("Tus cartas son:");
        for (int i = 0; i < cantidadCartasPedidas; i++) {
                baraja.get(i).setCartaUsada(true);
                System.out.println(baraja.get(i));
                if(cantidadCartasPedidas > baraja.size()){
                    System.out.println("No hay más cartas disponibles");
            }
        }
    }
    
    public void cartasMonton(ArrayList<Carta> baraja){
        System.out.println("Cartas repartidas");
        for (int i = 0; i < baraja.size(); i++) {
            if(baraja.get(i).isCartaUsada()){
                System.out.println(baraja.get(i));
            }
        }
    }
    
    public void mostrarBaraja(ArrayList<Carta> baraja){
         System.out.println("Cartas no utilizadas");
        for (int i = 0; i < baraja.size(); i++) {
            if(!baraja.get(i).isCartaUsada()){
                System.out.println(baraja.get(i));
            }
        }
    }
    
    }
