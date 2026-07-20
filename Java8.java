/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java8;
import java.util.Scanner;
/**
 *
 *@author [Jean Pierre Moreno Fajardo]
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String clave;
        
        do {
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();
        } while (!clave.equals("java2026")); // Condición invertida para continuar [12]
        
        System.out.println("Acceso concedido.");    
    }
    
}
