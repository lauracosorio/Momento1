/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momento1;

import java.util.ArrayList;
import java.util.Scanner;
import jugador.Jugador;

/**
 *
 * @author lau
 */
public class Momento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        int opcion;
        int camiseta;

        do {
            System.out.println("Bienvenido Reinaldo Rueda!!");
            System.out.println("***************************\n");

            System.out.println("1. Agregar Jugador");
            System.out.println("2. Buscar Jugador por número");
            System.out.println("3. Editar Jugador");
            System.out.println("4. Mostrar Jugadores");
            System.out.println("5. Salir\n");
            System.out.print("Digite una opción: ");
            opcion = entrada.nextInt();
            System.out.println(opcion + "\n");

            switch (opcion) {
                case 1:
                    Jugador jugador = new Jugador();
                    System.out.println("REGISTRO DE JUGADOR");
                    System.out.println("*******************\n");

                    System.out.println("Ingrese el nombre del jugador: ");
                    jugador.setNombre(entrada.next());
                    System.out.println("Ingrese el apellido del jugador: ");
                    jugador.setApellido(entrada.next());
                    System.out.println("Ingrese la edad del jugador: ");
                    jugador.setEdad(entrada.nextInt());
                    System.out.println("Ingrese el número de la camiseta del jugador: ");
                    jugador.setNumCamiseta(entrada.nextInt());
                    System.out.println("Ingrese la posición del jugador: ");
                    jugador.setPosicion(entrada.next());
                    System.out.println("Ingrese el equipo del jugador: ");
                    jugador.setEquipo(entrada.next());
                    System.out.println("\n");

                    jugadores.add(jugador);
                    System.out.println("*** JUGADOR CREADO CON ÉXITO ***\n");
                    break;

                case 2:
                    int sw = 0;
                    int pos = 0;
                    System.out.println("BUSQUEDA DEL JUGADOR");
                    System.out.println("********************");

                    System.out.println("Ingrese el número de la camiseta del jugador que desea buscar: ");
                    camiseta = entrada.nextInt();

                    if (jugadores.size() == 0) {
                        System.out.println("**************************************************************\n");
                        System.out.println("El número de la camiseta ingresada no pertenece a ningún jugador");
                        System.out.println("**************************************************************\n");
                    } else {
                        
                        while (pos < jugadores.size() && sw == 0) {
                            Jugador persona = jugadores.get(pos);

                            if (camiseta == persona.getNumCamiseta()) {
                                sw = 1;
                            } else {
                                pos++;
                            };
                        }
                        if (sw == 0) {
                            System.out.println("**************************************************************\n");
                            System.out.println("El número de la camiseta ingresada no pertenece a ningún jugador\n");
                            System.out.println("**************************************************************\n");
                        } else {
                            Jugador persona = jugadores.get(pos);

                            System.out.println("********************************\n");
                            System.out.println("Nombre Completo: " + persona.getNombre() + " " + persona.getApellido());
                            System.out.println("Número de la camiseta: " + persona.getNumCamiseta());
                            System.out.println("Edad: " + persona.getEdad());
                            System.out.println("Posición: " + persona.getPosicion());
                            System.out.println("Equipo: " + persona.getEquipo() + "\n");
                            System.out.println("********************************\n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("EDICIÓN DEL JUGADOR");
                    System.out.println("*******************\n");

                    System.out.println("Ingrese el número de la camiseta del jugador que desea modificar: ");
                    camiseta = entrada.nextInt();

                    if (jugadores.size() == 0) {
                        System.out.println("**************************************************************\n");
                        System.out.println("El número de la camiseta ingresada no pertenece a ningún jugador\n");
                        System.out.println("**************************************************************\n");
                    } else {
                        for (int i = 0; i < jugadores.size(); i++) {
                            Jugador persona = jugadores.get(i);

                            if (camiseta == persona.getNumCamiseta()) {
                                System.out.println("Nombre Completo: " + persona.getNombre() + " " + persona.getApellido());
                                System.out.println("Número de la camiseta: " + persona.getNumCamiseta());
                                System.out.println("Edad: " + persona.getEdad());
                                System.out.println("Posición: " + persona.getPosicion());
                                System.out.println("Equipo: " + persona.getEquipo());
                                System.out.println("********************************\n");

                                System.out.println("Ingrese nuevo Nombre: ");
                                persona.setNombre(entrada.next());
                                System.out.println("Ingrese nuevo Apellido: ");
                                persona.setApellido(entrada.next());
                                System.out.println("Ingrese nueva Edad: ");
                                persona.setEdad(entrada.nextInt());
                                System.out.println("Ingrese nueva Posición: ");
                                persona.setPosicion(entrada.next());
                                System.out.println("Ingrese nuevo Equipo: ");
                                persona.setEquipo(entrada.next());
                                System.out.println("********************************\n");
                                System.out.println("*** JUGADOR EDITADO CON ÉXITO ***\n");

                            } else {
                                System.out.println("**************************************************************\n");
                                System.out.println("El número de la camisa ingresada no pertenece a ningún jugador\n");
                                System.out.println("**************************************************************\n");
                            }
                        }
                    }

                    break;

                case 4:
                    System.out.println("BASE DE DATOS DE TODOS LOS JUGADORES");
                    System.out.println("************************************\n");
                    
                    if (jugadores.size() == 0) {
                        System.out.println("**************************************\n");
                        System.out.println("No se encuentran jugadores Registrados\n");
                        System.out.println("**************************************\n");
                    }else{
                        for (int i = 0; i < jugadores.size(); i++) {

                        System.out.println("Jugador " + (i + 1) + ": ");
                        Jugador persona = jugadores.get(i);

                        System.out.println("Nombre Completo: " + persona.getNombre() + " " + persona.getApellido());
                        System.out.println("Número de la camiseta: " + persona.getNumCamiseta());
                        System.out.println("Edad: " + persona.getEdad());
                        System.out.println("Posición: " + persona.getPosicion());
                        System.out.println("Equipo: " + persona.getEquipo() + "\n");
                        System.out.println("********************************\n");
                    }
                    }

                    
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }

        } while (opcion != 5);
    }

}
