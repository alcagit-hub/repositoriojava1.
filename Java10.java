/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java10;
import java.util.Scanner;
/**
 *
 * @author [Jean Pierre Moreno Fajardo]
 */
public class Java10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; 
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        
        double promedio = (double) suma / numeros.length;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
    
}
