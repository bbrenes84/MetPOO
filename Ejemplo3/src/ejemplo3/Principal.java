
package ejemplo3;

import java.util.Scanner;

/**
 * Sumar dos números
 * @author bbrenes84
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Dime el primer número; ");
        num1 = sc.nextInt();
        System.out.println("Dime el segundo número; ");
        num2 = sc.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es " + suma);
    }
    
}
