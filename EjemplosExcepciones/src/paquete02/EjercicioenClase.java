/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

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
        int numero;
        System.out.println("Ingrese el numero de tipo entero");
        numero = entrada.nextInt();
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
