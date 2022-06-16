/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Crear y presentar un obj de tipo Estudiante Presencial.
        // con datos por teclado 
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
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
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, creditos, costo);
        estPresencial.calcularMatriculaPresencial();
        System.out.println(estPresencial);
    }
}
