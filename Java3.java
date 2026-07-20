/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java3;
import java.util.Scanner;
/**
 *
 * @author [Jean Pierre Moreno Fajardo]
 */
public class Java3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
    
}
