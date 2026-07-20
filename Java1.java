/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java1;
import java.util.Scanner;

/**
 * @author [Jean Pierre Moreno Fajardo]
 */
public class Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer (trampa del nextLine) [8]
        
        System.out.print("Ingrese su carrera: ");
        String carrera = sc.nextLine();
        
        System.out.print("Ingrese su estatura (ej. 1,75): ");
        double estatura = sc.nextDouble();
        
        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
    }
}