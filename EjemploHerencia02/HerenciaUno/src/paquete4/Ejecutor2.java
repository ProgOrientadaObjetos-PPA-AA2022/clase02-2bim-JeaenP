/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        //1.Crear y presentar un obj de tipo Estudiante Presencial
        String nombre = "Jean";
        String apellido = "Valarezo";
        String identificacion = "1150038147";
        int edad = 18;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(5);
        estPresencial.establecerCostoCredito(324);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
