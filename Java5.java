/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java5;
import java.util.Scanner;
/**
 *
 * @author [Jean Pierre Moreno Fajardo]
 */
public class Java5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese calificacion (0-10): ");
        double cal = sc.nextDouble();
        
        if (cal >= 9 && cal <= 10) {
            System.out.println("Excelente");
        } else if (cal >= 8) {
            System.out.println("Muy Bueno");
        } else if (cal >= 7) {
            System.out.println("Bueno");
        } else if (cal >= 5) {
            System.out.println("Regular");
        } else if (cal >= 0) {
            System.out.println("Deficiente");
        } else {
            System.out.println("Calificación no válida.");
        }
    }
    
}
