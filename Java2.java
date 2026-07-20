/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2;
import java.util.Scanner;
/**
 * @author [Jean Pierre Moreno Fajardo]
 */
public class Java2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero entero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int n2 = sc.nextInt();
        
        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Resta: " + (n1 - n2));
        System.out.println("Multiplicacion: " + (n1 * n2));
        // Se aplica casting a double para obtener decimales en la división [10]
        System.out.println("Division: " + ((double) n1 / n2));
        System.out.println("Residuo: " + (n1 % n2));
    }
 
}
