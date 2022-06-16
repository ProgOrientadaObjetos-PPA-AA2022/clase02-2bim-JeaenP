/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //INgresar estudiante de tipo prezencial por teclado.
        //El usuario decide cuando terminar
        //No utilizar super.toString en Estudiante Presencial
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int op; String cadena = "";
        System.out.println("Elija una opcion");
        System.out.println("1) Ingresar un nuevo estudiante presencial");
        System.out.println("0) Salir");
        op = sc.nextInt();
        sc.nextLine();
        while ( op != 0 ){
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese los apellidos del estudiante:");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la identificacion del estudiante:");
            String identificacion = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            int edad = sc.nextInt();
            System.out.println("Ingrese el numero de creditos:");
            int creditos = sc.nextInt();
            System.out.println("Ingrese el costo de cada credito:");
            double costo = sc.nextDouble();
            sc.nextLine();
            EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                    apellido, identificacion, edad, creditos, costo);
            estPresencial.calcularMatriculaPresencial();
            System.out.println("Desea ingresar otro estudiante?");
            System.out.println("1) si");
            System.out.println("0) no");
            op = sc.nextInt();
            sc.nextLine();
            cadena = String.format("%s%s%s\n", cadena, estPresencial, "-------------------------------------");
        }
        System.out.println(cadena);

    }
}
