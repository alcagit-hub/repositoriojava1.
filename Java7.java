/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java7;
import java.util.Scanner;
/**
 *
 *  @author [Jean Pierre Moreno Fajardo]
 */
public class Java7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
        int suma = 0, contador = 0, num;
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        while (num >= 0) {
            suma += num;
            contador++;
            System.out.print("Ingrese otro numero: ");
            num = sc.nextInt();
        }
        
        System.out.println("Cantidad de numeros positivos: " + contador);
        System.out.println("Suma total: " + suma);
    }
    
}
