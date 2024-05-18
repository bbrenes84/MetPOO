package ejemplo2;

import java.util.Scanner;

/**
 * Leer un numero y decidir el antecesor
 * @author bbrenes84
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, antecesor;
        
        System.out.print("Dime un número: ");
        numero= leer.nextInt();
        antecesor= numero -1;
        System.out.print("El antecesor es " + antecesor);
        }
    
}
