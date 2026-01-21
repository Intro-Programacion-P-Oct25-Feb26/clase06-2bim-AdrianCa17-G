/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author UTPL
 */
public class EjercicioenClase {

    public static void main(String[] args) {

        int numero1 = ingresarNumero();
        int numero2 = ingresarNumero();
        int respuesta = sumaNumeros(numero1, numero2);
        respuestaSuma(numero1, numero2, respuesta);
    }

    public static int ingresarNumero() {

        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        int numero = 0;

        while (bandera) {
            try {
                System.out.println("Ingrese el numero de tipo entero");
                numero = entrada.nextInt();

                if (numero % 2 == 0 && numero >= 0) {

                    System.out.println("Numero es par y mayor a 0 por lo tanto sera sumado\n");
                    bandera = false;

                } else {

                    if (numero % 2 == 1) {
                        throw new Exception("Numero es impar por lo tanto no sera sumado, ingrese nuevamente\n");
                    } else if (numero < 0) {
                        throw new Exception("Numero es menor a 0 por lo tanto no sera sumado, ingrese nuevamente\n");
                    }
                }
            }catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }

            
        }
        return numero;
    }

    public static int sumaNumeros(int numero1, int numero2) {
        int respuesta = numero1 + numero2;
        return respuesta;
    }

    public static void respuestaSuma(int numero1, int numero2, int respuesta) {
        System.out.printf("La suma de: %d + %d es %d\n", numero1, numero2, respuesta);
    }

}
