package CapturaTeclado;
import java.util.Scanner;   

public class LeerDPantalla {
        public static void main (String[] args ) {
        int categoria = 0;
        System.out.println ("Ingrese el tipo de categoría");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();
        System.out.println ("La categoría es: "+categoria);
    }
}
