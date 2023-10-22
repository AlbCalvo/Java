/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas;
import java.util.Scanner;

public class Practicas {

    public static void main(String[] args) {
        double promedio;
        String condicionFinal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese promedio por pantalla");
        promedio=teclado.nextDouble();
        condicionFinal=promedio>=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condición final del alumno es: "+ condicionFinal);
        
               
    }
    
}
