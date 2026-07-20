/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java11;
import java.util.Scanner;
/**
 *
 * @author [Jean Pierre Moreno Fajardo]
 */
public class Java11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            nums[i] = sc.nextDouble();
        }
        
        double  mayor = nums[0], menor = nums[0]; 
        
        for (double n : nums) {
            if (n > mayor) mayor = n;
            if (n < menor) menor = n;
        }
        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
    
}
