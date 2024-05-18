
package ejemplo4;

import java.util.Scanner;

/**
 * La resta de dos números
 * @author bbrenes84
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resta;
        System.out.println("Dime el primer número ");
        num1 = sc.nextInt();
        System.out.println("Dime el segundo número ");
        num2 = sc.nextInt();
        resta = num1 - num2;
        System.out.println("La resta es igual a " + resta);
    }
    
}
